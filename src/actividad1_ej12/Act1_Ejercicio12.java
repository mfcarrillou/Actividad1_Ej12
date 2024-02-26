package actividad1_ej12;

public class Act1_Ejercicio12 {

    public static void main(String[] args) {
        double horas_trabajo,valor_hora,retencion_f,salario_bruto,salario_neto;
        horas_trabajo = 48;
        valor_hora = 5000;
        salario_bruto = horas_trabajo * valor_hora;
        retencion_f = salario_bruto * (12.5/100);
        salario_neto = salario_bruto - retencion_f;
        System.out.println("Las horas trabajadas por el empleado en la semana son: " + horas_trabajo);
        System.out.println("El valor por hora trabajada es: " + valor_hora);
        System.out.println("El salario bruto del empleado es: " + salario_bruto);
        System.out.println("La retención en la fuente es: " + retencion_f);
        System.out.println("El salario neto del empleado es: " + salario_neto);
    }
    
}
