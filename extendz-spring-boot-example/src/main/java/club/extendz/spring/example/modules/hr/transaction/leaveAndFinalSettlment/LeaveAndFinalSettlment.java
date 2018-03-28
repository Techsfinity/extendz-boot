/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package club.extendz.spring.example.modules.hr.transaction.leaveAndFinalSettlment;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

/***
 * @author Asitha Niranjan (asitha93@live.com)
 */
@Entity
@Getter
@Setter
public class LeaveAndFinalSettlment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long voucherNumber;
	@Temporal(TemporalType.DATE)
	private Date date;
	// settlement type
	@Temporal(TemporalType.DATE)
	private Date settlementDate;
	private Double duesCalculation;
	private Double wagesCalculation;
	// private Double pendingDeductions;
}
