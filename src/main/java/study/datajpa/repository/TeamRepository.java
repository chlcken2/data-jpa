package study.datajpa.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import study.datajpa.entity.Member;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface TeamRepository extends MemberRepository{

    @Override
    List<Member> findAll();

    @Override
    List<Member> findAll(Sort sort);

    @Override
    List<Member> findAllById(Iterable<Long> longs);

    @Override
    <S extends Member> List<S> saveAll(Iterable<S> entities);

    @Override
    void flush();

    @Override
    <S extends Member> S saveAndFlush(S entity);

    @Override
    <S extends Member> List<S> saveAllAndFlush(Iterable<S> entities);

    @Override
    default void deleteInBatch(Iterable<Member> entities) {
        MemberRepository.super.deleteInBatch(entities);
    }

    @Override
    void deleteAllInBatch(Iterable<Member> entities);

    @Override
    void deleteAllByIdInBatch(Iterable<Long> longs);

    @Override
    void deleteAllInBatch();

    @Override
    Member getOne(Long aLong);

    @Override
    Member getById(Long aLong);

    @Override
    Member getReferenceById(Long aLong);

    @Override
    <S extends Member> List<S> findAll(Example<S> example);

    @Override
    <S extends Member> List<S> findAll(Example<S> example, Sort sort);

    @Override
    Page<Member> findAll(Pageable pageable);

    @Override
    <S extends Member> S save(S entity);

    @Override
    Optional<Member> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Member entity);

    @Override
    void deleteAllById(Iterable<? extends Long> longs);

    @Override
    void deleteAll(Iterable<? extends Member> entities);

    @Override
    void deleteAll();

    @Override
    <S extends Member> Optional<S> findOne(Example<S> example);

    @Override
    <S extends Member> Page<S> findAll(Example<S> example, Pageable pageable);

    @Override
    <S extends Member> long count(Example<S> example);

    @Override
    <S extends Member> boolean exists(Example<S> example);

    @Override
    <S extends Member, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);


}
