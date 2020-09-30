package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    // 등록
    Member save(Member member);

    //조회
    Optional<Member> findById(Long id); //null이 반환될 경우도 생각
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
