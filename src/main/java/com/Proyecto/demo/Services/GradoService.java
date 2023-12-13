package com.Proyecto.demo.Services;

import com.Proyecto.demo.Entity.GradoUsuario;

import com.Proyecto.demo.Repository.GradoRepository;
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
public class GradoService implements GradoRepository {

    @Autowired
    private GradoRepository gradoRepository;

    @Override
    public List<GradoUsuario> buscarPorUsuario(int usuario_id) {
        return gradoRepository.buscarPorUsuario(usuario_id);
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends GradoUsuario> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends GradoUsuario> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<GradoUsuario> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public GradoUsuario getOne(Long aLong) {
        return null;
    }

    @Override
    public GradoUsuario getById(Long aLong) {
        return gradoRepository.getReferenceById(aLong);
    }

    @Override
    public GradoUsuario getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends GradoUsuario> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends GradoUsuario> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends GradoUsuario> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends GradoUsuario> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends GradoUsuario> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends GradoUsuario> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends GradoUsuario, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends GradoUsuario> S save(S entity) {
        return gradoRepository.save(entity);
    }

    @Override
    public <S extends GradoUsuario> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<GradoUsuario> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<GradoUsuario> findAll() {
        return null;
    }

    @Override
    public List<GradoUsuario> findAllById(Iterable<Long> longs) {
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
    public void delete(GradoUsuario entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends GradoUsuario> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<GradoUsuario> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<GradoUsuario> findAll(Pageable pageable) {
        return null;
    }

}
