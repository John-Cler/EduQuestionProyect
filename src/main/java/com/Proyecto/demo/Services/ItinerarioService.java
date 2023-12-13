package com.Proyecto.demo.Services;

import com.Proyecto.demo.Entity.Itinerario;
import com.Proyecto.demo.Repository.ItinerarioRepository;
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
public class ItinerarioService implements ItinerarioRepository {
    @Autowired
    ItinerarioRepository itinerarioRepository;

    @Override
    public boolean existeItinerarioMateria(int id) {
        return itinerarioRepository.buscarPorMateria(id)!=null;
    }

    @Override
    public Itinerario buscarPorMateria(int materia_id) {
        return itinerarioRepository.buscarPorMateria(materia_id);
    }

    @Override
    public List<Itinerario> buscarPorUsuarioGrado(int usuario_grado_id) {
        return itinerarioRepository.buscarPorUsuarioGrado(usuario_grado_id);
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Itinerario> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Itinerario> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Itinerario> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Itinerario getOne(Long aLong) {
        return null;
    }

    @Override
    public Itinerario getById(Long aLong) {
        return itinerarioRepository.getReferenceById(aLong);
    }

    @Override
    public Itinerario getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Itinerario> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Itinerario> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Itinerario> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Itinerario> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Itinerario> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Itinerario> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Itinerario, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Itinerario> S save(S entity) {
        return itinerarioRepository.save(entity);
    }

    @Override
    public <S extends Itinerario> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Itinerario> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Itinerario> findAll() {
        return null;
    }

    @Override
    public List<Itinerario> findAllById(Iterable<Long> longs) {
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
    public void delete(Itinerario entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Itinerario> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Itinerario> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Itinerario> findAll(Pageable pageable) {
        return null;
    }

}
