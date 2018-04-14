/*
 * 2007-2016 [PagSeguro Internet Ltda.]
 *
 * NOTICE OF LICENSE
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright: 2007-2016 PagSeguro Internet Ltda.
 * Licence: http://www.apache.org/licenses/LICENSE-2.0
 */
package br.com.uol.pagseguro.api.common.domain;


/**
 * Interface for transaction payment method
 *
 * @author PagSeguro Internet Ltda.
 */
public interface TransactionPaymentMethod {

  /**
   * Get type id of transaction payment method
   *
   * @return Type id
   */
  Integer getTypeId();

  /**
   * Get code id of transaction payment method
   *
   * @return Code id
   */
  Integer getCodeId();

  /**
   * Get code of transaction payment method
   *
   * @return Code
   * @see Code
   */
  Code getCode();

  /**
   * Get type of transaction payment method
   *
   * @return Type
   * @see Type
   */
  Type getType();

  /**
   * Code enum
   */
  enum Code {

    CREDIT_CARD_VISA(101, "Cartão de crédito Visa"),
    CREDIT_CARD_MASTERCARD(102, "Cartão de crédito MasterCard"),
    CREDIT_CARD_AMEX(103, "Cartão de crédito American Express"),
    CREDIT_CARD_DINERS(104, "Cartão de crédito Diners"),
    CREDIT_CARD_HIPERCARD(105, "Cartão de crédito Hipercard"),
    CREDIT_CARD_AURA(106, "Cartão de crédito Aura"),
    CREDIT_CARD_ELO(107, "Cartão de crédito Elo"),
    CREDIT_CARD_PLENOCARD(108, "Cartão de crédito PLENOCard"),
    CREDIT_CARD_PERSONALCARD(109, "Cartão de crédito PersonalCard"),
    CREDIT_CARD_JCB(110, "Cartão de crédito JCB"),
    CREDIT_CARD_DISCOVER(111, "Cartão de crédito Discover"),
    CREDIT_CARD_BRASILCARD(112, "Cartão de crédito BrasilCard"),
    CREDIT_CARD_FORTBRASIL(113, "Cartão de crédito FortBrasil"),
    CREDIT_CARD_CARDBAN(114, "Cartão de crédito CardBan"),
    CREDIT_CARD_VALECARD(115, "Cartão de crédito ValeCard"),
    CREDIT_CARD_CABAL(116, "Cartão de crédito Cabal"),
    CREDIT_CARD_MAIS(117, "Cartão de crédito Mais!"),
    CREDIT_CARD_AVISTA(118, "Cartão de Crédito Avista"),
    CREDIT_CARD_GRANDCARD(119, "Cartão de crédito GrandCard"),
    CREDIT_CARD_SOROCRED(120, "Cartão de crédito Sorocred"),

    BOLETO_BRADESCO(201, "Boleto Bradesco"),
    BOLETO_SANTANDER(202, "Boleto Santander"),

    ONLINE_DEBIT_BRADESCO(301, "Débito online Bradesco"),
    ONLINE_DEBIT_ITAU(302, "Débito online Itaú"),
    ONLINE_DEBIT_UNIBANCO(303, "Débito online Unibanco"),
    ONLINE_DEBIT_BANCO_BRASIL(304, "Débito online Branco do Brasil"),
    ONLINE_DEBIT_BANCO_REAL(305, "Débito online Banco Real"),
    ONLINE_DEBIT_BANRISUL(306, "Débito online Banrisul"),
    ONLINE_DEBIT_HSBC(307, "Débito online HSBC"),

    PAGSEGURO_BALANCE(401, "Saldo PagSeguro"),

    OI_PAGGO(501, "Oi Paggo"),

    BANK_DEPOSIT_BANCO_BRASIL(701, "Depósito em conta - Banco do Brasil"),
    BANK_DEPOSIT_HSBC(702, "Depósito em conta - HSBC"),


    /**
     * Used when they have not the code
     *
     * UNKNOW
     */
    UNKNOW(null, "Não informado"),

    /**
     * Used when you have the code but is not mapped in lib.
     *
     * UNRECOGNIZED
     */
    UNRECOGNIZED(null, "Não reconhecido");

    private Integer codeId;
    private String description;

    /**
     * Constructor
     */
    Code(Integer codeId, String description) {
      this.codeId = codeId;
      this.description = description;
    }

    public String getDescription() {
      return description;
    }

    /**
     * Get enum code by code id
     *
     * @param codeId Code id
     * @return Enum code
     */
    public static Code fromCodeId(int codeId) {
      for (Code code : Code.values()) {
        if (code.codeId != null && code.codeId == codeId) {
          return code;
        }
      }
      return UNRECOGNIZED;
    }

  }

  /**
   * Type enum
   */
  enum Type {

    /**
     * CREDIT CARD
     */
    CREDIT_CARD(1),

    /**
     * BANK SLIP
     */
    BOLETO(2),

    /**
     * ONLINE DEBIT
     */
    ONLINE_DEBIT(3),

    PAGSEGURO_BALANCE(4),

    OI_PAGGO(5),

    BANK_DEPOSIT(7),

    /**
     * Used when they have not the TYPE
     *
     * UNKNOW
     */
    UNKNOW(null),

    /**
     * Used when you have the TYPE but is not mapped in lib.
     *
     * UNRECOGNIZED
     */
    UNRECOGNIZED(null);

    private Integer typeId;

    /**
     * Constructor
     *
     * @param typeId Type id
     */
    Type(Integer typeId) {
      this.typeId = typeId;
    }

    /**
     * Get type enum by type id
     *
     * @param typeId Type id
     * @return Type enum
     */
    public static Type fromTypeId(int typeId) {
      for (Type type : Type.values()) {
        if (type.typeId != null && type.typeId == typeId) {
          return type;
        }
      }
      return UNRECOGNIZED;
    }

  }
}
