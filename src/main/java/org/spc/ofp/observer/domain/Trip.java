/*
 * Copyright (C) 2011 Secretariat of the Pacific Community
 *
 * This file is part of TUBS.
 *
 * TUBS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TUBS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with TUBS.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spc.ofp.observer.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class Trip {

	protected long id;
	protected String programId;
	protected String observerId;	
	protected String tripNumber;
	protected Date departureDate;
	protected Date returnDate;	
	protected Long boatId;	
	protected String vesselName;
	protected String registrationNumber;
	protected String flagId;
	protected String fleetId;
	protected Double grossTonnage;
	protected String gearType;
	protected Integer departureId;
	protected Integer returnId;
	protected String departurePortName;
	protected String returnPortName;
	
	// Domain entities
	protected FieldStaff observer;
	protected Vessel boat;
	protected Port departurePort;
	protected Port returnPort;
	protected Gen3 gen3Report;
	protected Collection<Gen6Header> pollutionReports = new ArrayList<Gen6Header>();
	protected Collection<Electronics> electronics = new ArrayList<Electronics>();
	protected Collection<FishTransfer> fishTransfers = new ArrayList<FishTransfer>();
	protected Collection<VesselSighting> vesselSightings = new ArrayList<VesselSighting>();
	protected Collection<MarineDevice> marineDevices = new ArrayList<MarineDevice>();
	protected Collection<Safety> safetyInspections = new ArrayList<Safety>();
	protected Collection<SpecialSpecies> specialSpecies = new ArrayList<SpecialSpecies>();
	
	public boolean isPurseSeineTrip() {
		return null != gearType && "S".equalsIgnoreCase(gearType.trim());
	}
	
	public boolean isLongLineTrip() {
		return null != gearType && "L".equalsIgnoreCase(gearType.trim());
	}
	
	public boolean isPoleAndLineTrip() {
		return null != gearType && "P".equalsIgnoreCase(gearType.trim());
	}
		
	public long getId() {
		return id;
	}
	public void setId(final long id) {
		this.id = id;
	}
	public String getProgramId() {
		return programId;
	}
	public void setProgramId(final String programId) {
		this.programId = programId;
	}
	public String getObserverId() {
		return observerId;
	}
	public void setObserverId(final String observerId) {
		this.observerId = observerId;
	}
	public String getTripNumber() {
		return tripNumber;
	}
	public void setTripNumber(final String tripNumber) {
		this.tripNumber = tripNumber;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(final Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(final Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getVesselName() {
		return vesselName;
	}
	public void setVesselName(final String vesselName) {
		this.vesselName = vesselName;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(final String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getFlagId() {
		return flagId;
	}
	public void setFlagId(final String flagId) {
		this.flagId = flagId;
	}
	public String getFleetId() {
		return fleetId;
	}
	public void setFleetId(final String fleetId) {
		this.fleetId = fleetId;
	}
	public Double getGrossTonnage() {
		return grossTonnage;
	}
	public void setGrossTonnage(final Double grossTonnage) {
		this.grossTonnage = grossTonnage;
	}
	public Integer getDepartureId() {
		return departureId;
	}
	public void setDepartureId(final Integer departureId) {
		this.departureId = departureId;
	}
	public Integer getReturnId() {
		return returnId;
	}
	public void setReturnId(final Integer returnId) {
		this.returnId = returnId;
	}
	public String getDeparturePortName() {
		return departurePortName;
	}
	public void setDeparturePortName(final String departurePort) {
		this.departurePortName = departurePort;
	}
	public String getReturnPortName() {
		return returnPortName;
	}
	public void setReturnPortName(final String returnPort) {
		this.returnPortName = returnPort;
	}
	public FieldStaff getObserver() {
		return observer;
	}
	public void setObserver(final FieldStaff observer) {
		this.observer = observer;
	}
	public Long getBoatId() {
		return boatId;
	}
	public void setBoatId(final Long boatId) {
		this.boatId = boatId;
	}
	public Vessel getBoat() {
		return boat;
	}
	public void setBoat(final Vessel boat) {
		this.boat = boat;
	}
	public Gen3 getGen3Report() {
		return gen3Report;
	}
	public void setGen3Report(final Gen3 report) {
		this.gen3Report = report;
	}
	public Collection<Gen6Header> getPollutionReports() {
		return pollutionReports;
	}
	public Collection<Electronics> getElectronics() {
		return electronics;
	}
	public Collection<FishTransfer> getFishTransfers() {
		return fishTransfers;
	}
	public Collection<VesselSighting> getVesselSightings() {
		return vesselSightings;
	}
	public Collection<MarineDevice> getMarineDevices() {
		return marineDevices;
	}
	public Collection<Safety> getSafetyInspections() {
		return safetyInspections;
	}
	public Collection<SpecialSpecies> getSpecialSpecies() {
		return specialSpecies;
	}

	// Add subordinate entities by adding to an existing list
	public boolean addElectronics(final Electronics e) {
		return electronics.add(e);
	}
	public boolean addElectronics(final Collection<Electronics> ec) {
		return electronics.addAll(ec);
	}
	public boolean addFishTransfer(final FishTransfer ft) {
		return fishTransfers.add(ft);
	}
	public boolean addFishTransfers(final Collection<FishTransfer> ftl) {
		return fishTransfers.addAll(ftl);
	}
	public boolean addVesselSighting(final VesselSighting vs) {
		return vesselSightings.add(vs);
	}
	public boolean addVesselSightings(final Collection<VesselSighting> vsl) {
		return vesselSightings.addAll(vsl);
	}
	public boolean addMarineDevice(final MarineDevice md) {
		return marineDevices.add(md);
	}
	public boolean addMarineDevices(final Collection<MarineDevice> mdl) {
		return marineDevices.addAll(mdl);
	}
	public boolean addSafetyInspection(final Safety s) {
		return safetyInspections.add(s);
	}
	public boolean addSafetyInspections(final Collection<Safety> sl) {
		return safetyInspections.addAll(sl);
	}
	public boolean addSpecialSpecies(final SpecialSpecies ss) {
		return specialSpecies.add(ss);
	}
	public boolean addSpecialSpecies(final Collection<SpecialSpecies> ssl) {
		return specialSpecies.addAll(ssl);
	}
	public boolean addPollutionReport(final Gen6Header g6h) {
		return pollutionReports.add(g6h);
	}
	public boolean addPollutionReports(final Collection<Gen6Header> rpts) {
		return pollutionReports.addAll(rpts);
	}	
	public Port getDeparturePort() {
		return departurePort;
	}
	public void setDeparturePort(Port departurePort) {
		this.departurePort = departurePort;
	}
	public Port getReturnPort() {
		return returnPort;
	}
	public void setReturnPort(Port returnPort) {
		this.returnPort = returnPort;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
}
