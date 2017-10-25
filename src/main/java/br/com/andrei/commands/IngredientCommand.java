package br.com.andrei.commands;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {

	private Long id;
	private Long recipeId;
	@NotBlank
	private String description;
	private BigDecimal amount;
	private UnitOfMeasureCommand uom;
}
