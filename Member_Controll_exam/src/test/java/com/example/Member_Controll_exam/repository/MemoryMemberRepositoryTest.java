package com.example.Member_Controll_exam.repository;

import com.example.Member_Controll_exam.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStroe();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("Hyeonuk");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        Assertions.assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("Hyeonuk1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("Hyeonuk2");
        repository.save(member2);

        Member result = repository.findByName("Hyeonuk1").get();

        Assertions.assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("Hyeonuk1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("Hyeonuk2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        Assertions.assertThat(result.size()).isEqualTo(2);
    }
}
