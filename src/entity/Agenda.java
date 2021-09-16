package entity;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Agenda {
    List<Pessoa> lstPessoa = new List<Pessoa>() {

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Pessoa> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Pessoa pessoa) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Pessoa> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Pessoa> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Pessoa get(int index) {
            return null;
        }

        @Override
        public Pessoa set(int index, Pessoa element) {
            return null;
        }

        @Override
        public void add(int index, Pessoa element) {

        }

        @Override
        public Pessoa remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Pessoa> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Pessoa> listIterator(int index) {
            return null;
        }

        @Override
        public List<Pessoa> subList(int fromIndex, int toIndex) {
            return null;
        }

        //-------------------------
        public void armazenarPessoa(Pessoa pessoa){
            // IMPUT NA LISTA
            lstPessoa.add(pessoa);
        }

        public void removerPessoa(String nome){
            // REMOVE PESSOA DA AGENDA
            lstPessoa.removeIf(pessoa -> pessoa.getNome().equals(nome));
        }

        public int buscarPessoa(String nome){
            // BUSCA A PESSOA NA AGENDA
            lstPessoa.stream()
                    .filter(pessoa -> pessoa.getNome().equals(nome))
                    .forEach(s -> System.out.println(s));

            return lstPessoa.indexOf(nome);
        }

        public void exibirTodaAgenda(){
            // PRINT DA LISTA INTEIRA
            lstPessoa.stream()
                    .forEach(s -> System.out.println(s));
        }

        public void exibirPessoa(int index){
            // PRINT DA LISTA
            System.out.println(lstPessoa.indexOf(index));
        }

        //-------------------------

    };
}
