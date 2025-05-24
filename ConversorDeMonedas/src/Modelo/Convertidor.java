package Modelo;

public record Convertidor(
        String base_code,
        String target_code,
        double conversion_rate,
        double conversion_result
) {
}
