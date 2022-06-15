package calculadoraTESTE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

 private Calculadora calculadora;
 @BeforeEach
 void setup() {
 System.out.println ( "@BeforeEach executado" );
 calculadora = new Calculadora();
 }
 @Test
 void testDoisMaisDois () {
 System.out.println ( "== TESTE 1 EXECUTADO ==" );
 Assertions.assertEquals ( 4 , calculadora.soma ( 2 , 2 )); }
 @Test
 void test2 () {
 System.out.println ( "== TESTE 2 EXECUTADO ==" );
 Assertions.assertEquals ( 8 , calculadora.soma ( 4 , 4 )); }
 @Test
 void test3 () {
 System.out.println ( "== TESTE 3 EXECUTADO ==" );
 Assertions.assertEquals ( 6 , calculadora.soma ( 3 , 3 )); }
 @Test
 void test4 () {
 System.out.println ( "== TESTE 4 EXECUTADO ==" );
 Assertions.assertEquals ( 4 , calculadora.soma ( 2 , 2 )); }
 void test5 () {
 System.out.println ( "== TESTE 5 EXECUTADO ==" );
 Assertions.assertEquals ( 1 , calculadora.sub ( 2 , 1 )); }
 void test6 () {
 System.out.println ( "== TESTE 6 EXECUTADO ===" );
 Assertions.assertEquals ( -2 , calculadora.sub ( 2 , 4 )); }
 void test7 () {
 System.out.println ( "== TESTE 7 EXECUTADO ===" );
 Assertions.assertEquals ( -2 , calculadora.sub ( 4 , 1 )); }
 void test8 () {
 System.out.println ( "== TESTE 8 EXECUTADO ===" );
 Assertions.assertEquals ( 4 , calculadora.sub ( 5 , 1 )); }
 void test9() {
 System.out.println ( "== TESTE 9 EXECUTADO ===" );
 Assertions.assertEquals ( 0 , calculadora.mult ( 2 , 0 )); }
 void test10 () {
 System.out.println ( "== TESTE 10 EXECUTADO ===" );
 Assertions.assertEquals ( 8 , calculadora.mult ( 2 , 4 )); }
 void test11 () {
 System.out.println ( "== TESTE 11 EXECUTADO ===" );
 Assertions.assertEquals ( 16 , calculadora.mult ( 4 , 4 )); }
 void test12 () {
 System.out.println ( "== TESTE 12 EXECUTADO ===" );
 Assertions.assertEquals ( 10 , calculadora.mult ( 2 , 5 )); }
 void test13 () {
 System.out.println ( "== TESTE 13 EXECUTADO ===" );
 Assertions.assertEquals ( 1 , calculadora.div ( 4 , 4 )); }
 void test14 () {
 System.out.println ( "== TESTE 14 EXECUTADO ===" );
 Assertions.assertEquals ( 2 , calculadora.div ( 8 , 4 )); }
 void test15 () {
 System.out.println ( "== TESTE 15 EXECUTADO ===" );
 Assertions.assertEquals ( 4 , calculadora.div ( 16 , 4 )); }
 void test16 () {
 System.out.println ( "== TESTE 16 EXECUTADO ===" );
 Assertions.assertEquals ( 5 , calculadora.div ( 20 , 4 )); }

 @AfterEach
 void tearThis () {
 System.out.println ( "@AfterEach executado" );
 }

}