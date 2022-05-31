package com.example.Member_Controll_exam.repository;

import com.example.Member_Controll_exam.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MemoryMemberRepositoryTest {
    MemberRepository repository = new MemoryMemberRepository();

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
}
