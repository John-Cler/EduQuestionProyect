package com.Proyecto.demo.Services;

import com.Proyecto.demo.Dto.MateriaDto;
import com.Proyecto.demo.Entity.Materia;
import com.Proyecto.demo.Repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class MateriaService implements MateriaRepository {
    @Autowired
    private MateriaRepository materiaRepository;

    @Override
    public List<Materia> buscarPorUsuarioGrado(int usuario_grado_id) {
        return materiaRepository.buscarPorUsuarioGrado(usuario_grado_id);
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Materia> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Materia> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Materia> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Materia getOne(Long aLong) {
        return null;
    }

    @Override
    public Materia getById(Long aLong) {
        return materiaRepository.getReferenceById(aLong);
    }

    @Override
    public Materia getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Materia> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Materia> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Materia> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Materia> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Materia> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Materia> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Materia, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Materia> S save(S entity) {
        return materiaRepository.save(entity);
    }

    @Override
    public <S extends Materia> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Materia> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Materia> findAll() {
        return null;
    }

    @Override
    public List<Materia> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Materia entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Materia> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Materia> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Materia> findAll(Pageable pageable) {
        return null;
    }

}
