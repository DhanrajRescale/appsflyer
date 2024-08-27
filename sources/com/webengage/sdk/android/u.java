package com.webengage.sdk.android;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class u extends s implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a, reason: collision with root package name */
    static GoogleApiClient f12675a;

    /* renamed from: b, reason: collision with root package name */
    public Context f12676b;

    /* renamed from: c, reason: collision with root package name */
    LocationRequest f12677c = null;

    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        String f12678a;

        /* renamed from: b, reason: collision with root package name */
        Location f12679b;

        /* renamed from: c, reason: collision with root package name */
        int f12680c;

        public a(String str, Location location, int i10) {
            this.f12678a = str;
            this.f12679b = location;
            this.f12680c = i10;
        }

        public String a() {
            return this.f12678a;
        }

        public Location b() {
            return this.f12679b;
        }

        public int c() {
            return this.f12680c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f12678a;
            if (str != null) {
                return str.equals(aVar.f12678a);
            }
            return false;
        }

        public int hashCode() {
            String str = this.f12678a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("GeoFenceTransition: {\n id: ");
            sb2.append(this.f12678a);
            sb2.append(", Location: ");
            sb2.append(this.f12679b);
            sb2.append(", Transition: ");
            return nn.d.m(sb2, this.f12680c, "\n}");
        }
    }

    public u(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f12676b = applicationContext;
        GoogleApiClient build = new GoogleApiClient.Builder(applicationContext).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
        f12675a = build;
        build.connect();
    }

    @Override // com.webengage.sdk.android.s
    public Location a() {
        GoogleApiClient googleApiClient = f12675a;
        if (googleApiClient != null && googleApiClient.isConnecting()) {
            synchronized (this) {
                try {
                    wait(5000L);
                } catch (InterruptedException unused) {
                }
            }
        }
        GoogleApiClient googleApiClient2 = f12675a;
        if (googleApiClient2 == null || !googleApiClient2.isConnected()) {
            return null;
        }
        return LocationServices.FusedLocationApi.getLastLocation(f12675a);
    }

    @Override // com.webengage.sdk.android.s
    public Location b(Intent intent) {
        Bundle extras;
        if (com.webengage.sdk.android.utils.i.j()) {
            if (LocationResult.hasResult(intent)) {
                return LocationResult.extractResult(intent).getLastLocation();
            }
            return null;
        }
        if (com.webengage.sdk.android.utils.i.c() && (extras = intent.getExtras()) != null && extras.containsKey("com.google.android.location.LOCATION")) {
            return (Location) extras.getParcelable("com.google.android.location.LOCATION");
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
        synchronized (this) {
            notifyAll();
        }
        try {
            a(this.f12677c, this.f12676b, f12675a);
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public synchronized void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public synchronized void onConnectionSuspended(int i10) {
        f12675a.connect();
    }

    @Override // com.webengage.sdk.android.s
    public List<a> a(Intent intent) {
        List triggeringGeofences;
        if (!com.webengage.sdk.android.utils.i.d()) {
            return null;
        }
        GeofencingEvent fromIntent = GeofencingEvent.fromIntent(intent);
        if (fromIntent.hasError() || (triggeringGeofences = fromIntent.getTriggeringGeofences()) == null || triggeringGeofences.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = triggeringGeofences.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(((Geofence) it.next()).getRequestId(), fromIntent.getTriggeringLocation(), fromIntent.getGeofenceTransition()));
        }
        return arrayList;
    }

    @Override // com.webengage.sdk.android.s
    public void b() {
        GoogleApiClient googleApiClient = f12675a;
        if (googleApiClient == null || !googleApiClient.isConnected()) {
            return;
        }
        if (!PendingIntentFactory.g(this.f12676b)) {
            Logger.d("WebEngage", "Location pending intent does not exists, no need to unregister");
            return;
        }
        Logger.d("WebEngage", "UnRegistering from location updates ");
        PendingIntent c10 = PendingIntentFactory.c(this.f12676b);
        LocationServices.FusedLocationApi.removeLocationUpdates(f12675a, c10);
        c10.cancel();
    }

    @Override // com.webengage.sdk.android.s
    public void a(double d10, double d11, float f10, String str, WebEngageConfig webEngageConfig) {
        if (com.webengage.sdk.android.utils.i.e() && com.webengage.sdk.android.utils.i.f()) {
            Geofence build = new Geofence.Builder().setCircularRegion(d10, d11, f10).setRequestId(str).setExpirationDuration(-1L).setTransitionTypes(3).build();
            GoogleApiClient googleApiClient = f12675a;
            if (googleApiClient != null && googleApiClient.isConnecting()) {
                synchronized (this) {
                    try {
                        wait(5000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            GoogleApiClient googleApiClient2 = f12675a;
            if (googleApiClient2 == null || !googleApiClient2.isConnected()) {
                return;
            }
            LocationServices.GeofencingApi.addGeofences(f12675a, new GeofencingRequest.Builder().setInitialTrigger(4).addGeofence(build).build(), PendingIntentFactory.b(this.f12676b));
            if (webEngageConfig == null || webEngageConfig.getLocationTrackingStrategy() == LocationTrackingStrategy.ACCURACY_BEST) {
                return;
            }
            Logger.w("WebEngage", "Current location tracking strategy is " + webEngageConfig.getLocationTrackingStrategy() + ", for better geofencing results use WebEngage.get().setLocationTrackingStrategy(LocationTrackingStrategy.ACCURACY_BEST)");
        }
    }

    @Override // com.webengage.sdk.android.s
    public void a(long j10, long j11, float f10, int i10) {
        LocationRequest locationRequest = new LocationRequest();
        this.f12677c = locationRequest;
        locationRequest.setInterval(j10);
        this.f12677c.setFastestInterval(j11);
        this.f12677c.setSmallestDisplacement(f10);
        this.f12677c.setPriority(i10);
        a(this.f12677c, this.f12676b, f12675a);
    }

    private void a(LocationRequest locationRequest, Context context, GoogleApiClient googleApiClient) {
        if (locationRequest == null || context == null || googleApiClient == null || !googleApiClient.isConnected()) {
            return;
        }
        Logger.d("WebEngage", "Registering for location updates");
        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, PendingIntentFactory.c(context.getApplicationContext()));
    }

    @Override // com.webengage.sdk.android.s
    public void a(List<String> list) {
        GoogleApiClient googleApiClient = f12675a;
        if (googleApiClient == null || !googleApiClient.isConnected()) {
            return;
        }
        LocationServices.GeofencingApi.removeGeofences(f12675a, list);
    }
}
