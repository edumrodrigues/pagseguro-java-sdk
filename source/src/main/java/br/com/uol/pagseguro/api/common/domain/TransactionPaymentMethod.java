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

    CREDIT_CARD_VISA(101),
    CREDIT_CARD_MASTERCARD(102),
    CREDIT_CARD_AMEX(103),
    CREDIT_CARD_DINERS(104),
    CREDIT_CARD_HIPERCARD(105),
    CREDIT_CARD_AURA(106),
    CREDIT_CARD_ELO(107),
    CREDIT_CARD_PLENOCARD(108),
    CREDIT_CARD_PERSONALCARD(109),
    CREDIT_CARD_JCB(110),
    CREDIT_CARD_DISCOVER(111),
    CREDIT_CARD_BRASILCARD(112),
    CREDIT_CARD_FORTBRASIL(113),
    CREDIT_CARD_CARDBAN(114),
    CREDIT_CARD_VALECARD(115),
    CREDIT_CARD_CABAL(116),
    CREDIT_CARD_MAIS(117),
    CREDIT_CARD_AVISTA(118),
    CREDIT_CARD_GRANDCARD(119),
    CREDIT_CARD_SOROCRED(120),

    BOLETO_BRADESCO(201),
    BOLETO_SANTANDER(202),

    ONLINE_DEBIT_BRADESCO(301),
    ONLINE_DEBIT_ITAU(302),
    ONLINE_DEBIT_UNIBANCO(303),
    ONLINE_DEBIT_BANCO_BRASIL(304),
    ONLINE_DEBIT_BANCO_REAL(305),
    ONLINE_DEBIT_BANRISUL(306),
    ONLINE_DEBIT_HSBC(307),

    PAGSEGURO_BALANCE(401),

    OI_PAGGO(501),

    BANK_DEPOSIT_BANCO_BRASIL(701),
    BANK_DEPOSIT_HSBC(702),


    /**
     * Used when they have not the code
     *
     * UNKNOW
     */
    UNKNOW(null),

    /**
     * Used when you have the code but is not mapped in lib.
     *
     * UNRECOGNIZED
     */
    UNRECOGNIZED(null);

    private Integer codeId;

    /**
     * Constructor
     */
    Code(Integer codeId) {
      this.codeId = codeId;
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
