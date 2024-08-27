package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import in.juspay.hypersdk.core.PaymentConstants;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzge implements zzgz {
    private static volatile zzge zzd;
    private zzel zzA;
    private Boolean zzC;
    private long zzD;
    private volatile Boolean zzE;
    private volatile boolean zzF;
    private int zzG;

    @VisibleForTesting
    protected Boolean zza;

    @VisibleForTesting
    protected Boolean zzb;

    @VisibleForTesting
    final long zzc;
    private final Context zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private final zzab zzj;
    private final zzag zzk;
    private final zzfj zzl;
    private final zzeu zzm;
    private final zzgb zzn;
    private final zzko zzo;
    private final zzlo zzp;
    private final zzep zzq;
    private final Clock zzr;
    private final zziy zzs;
    private final zzij zzt;
    private final zzd zzu;
    private final zzin zzv;
    private final String zzw;
    private zzen zzx;
    private zzjy zzy;
    private zzaq zzz;
    private boolean zzB = false;
    private final AtomicInteger zzH = new AtomicInteger(0);

    public zzge(zzhh zzhhVar) {
        long currentTimeMillis;
        Bundle bundle;
        Preconditions.checkNotNull(zzhhVar);
        Context context = zzhhVar.zza;
        zzab zzabVar = new zzab(context);
        this.zzj = zzabVar;
        zzee.zza = zzabVar;
        this.zze = context;
        this.zzf = zzhhVar.zzb;
        this.zzg = zzhhVar.zzc;
        this.zzh = zzhhVar.zzd;
        this.zzi = zzhhVar.zzh;
        this.zzE = zzhhVar.zze;
        this.zzw = zzhhVar.zzj;
        this.zzF = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhhVar.zzg;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzib.zzd(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzr = defaultClock;
        Long l10 = zzhhVar.zzi;
        if (l10 != null) {
            currentTimeMillis = l10.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.zzc = currentTimeMillis;
        this.zzk = new zzag(this);
        zzfj zzfjVar = new zzfj(this);
        zzfjVar.zzw();
        this.zzl = zzfjVar;
        zzeu zzeuVar = new zzeu(this);
        zzeuVar.zzw();
        this.zzm = zzeuVar;
        zzlo zzloVar = new zzlo(this);
        zzloVar.zzw();
        this.zzp = zzloVar;
        this.zzq = new zzep(new zzhg(zzhhVar, this));
        this.zzu = new zzd(this);
        zziy zziyVar = new zziy(this);
        zziyVar.zzb();
        this.zzs = zziyVar;
        zzij zzijVar = new zzij(this);
        zzijVar.zzb();
        this.zzt = zzijVar;
        zzko zzkoVar = new zzko(this);
        zzkoVar.zzb();
        this.zzo = zzkoVar;
        zzin zzinVar = new zzin(this);
        zzinVar.zzw();
        this.zzv = zzinVar;
        zzgb zzgbVar = new zzgb(this);
        zzgbVar.zzw();
        this.zzn = zzgbVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhhVar.zzg;
        boolean z10 = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            zzij zzq = zzq();
            if (zzq.zzt.zze.getApplicationContext() instanceof Application) {
                Application application = (Application) zzq.zzt.zze.getApplicationContext();
                if (zzq.zza == null) {
                    zzq.zza = new zzii(zzq);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(zzq.zza);
                    application.registerActivityLifecycleCallbacks(zzq.zza);
                    a.y(zzq.zzt, "Registered activity lifecycle callback");
                }
            }
        } else {
            a.v(this, "Application context is not an Application");
        }
        zzgbVar.zzp(new zzgd(this, zzhhVar));
    }

    public static /* bridge */ /* synthetic */ void zzA(zzge zzgeVar, zzhh zzhhVar) {
        zzgeVar.zzaB().zzg();
        zzgeVar.zzk.zzn();
        zzaq zzaqVar = new zzaq(zzgeVar);
        zzaqVar.zzw();
        zzgeVar.zzz = zzaqVar;
        zzel zzelVar = new zzel(zzgeVar, zzhhVar.zzf);
        zzelVar.zzb();
        zzgeVar.zzA = zzelVar;
        zzen zzenVar = new zzen(zzgeVar);
        zzenVar.zzb();
        zzgeVar.zzx = zzenVar;
        zzjy zzjyVar = new zzjy(zzgeVar);
        zzjyVar.zzb();
        zzgeVar.zzy = zzjyVar;
        zzgeVar.zzp.zzx();
        zzgeVar.zzl.zzx();
        zzgeVar.zzA.zzc();
        zzes zzi = zzgeVar.zzaA().zzi();
        zzgeVar.zzk.zzh();
        zzi.zzb("App measurement initialized, version", 77000L);
        zzgeVar.zzaA().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzl = zzelVar.zzl();
        if (TextUtils.isEmpty(zzgeVar.zzf)) {
            if (zzgeVar.zzv().zzaf(zzl)) {
                zzgeVar.zzaA().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzgeVar.zzaA().zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(zzl)));
            }
        }
        zzgeVar.zzaA().zzc().zza("Debug-level message logging enabled");
        if (zzgeVar.zzG != zzgeVar.zzH.get()) {
            zzgeVar.zzaA().zzd().zzc("Not all components initialized", Integer.valueOf(zzgeVar.zzG), Integer.valueOf(zzgeVar.zzH.get()));
        }
        zzgeVar.zzB = true;
    }

    public static final void zzO() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzP(zzgx zzgxVar) {
        if (zzgxVar != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzQ(zzf zzfVar) {
        if (zzfVar != null) {
            if (zzfVar.zze()) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzfVar.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    private static final void zzR(zzgy zzgyVar) {
        if (zzgyVar != null) {
            if (zzgyVar.zzy()) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzgyVar.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    public static zzge zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l10) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzd == null) {
            synchronized (zzge.class) {
                try {
                    if (zzd == null) {
                        zzd = new zzge(new zzhh(context, zzclVar, l10));
                    }
                } finally {
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzd);
            zzd.zzE = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzd);
        return zzd;
    }

    public final void zzB() {
        this.zzH.incrementAndGet();
    }

    public final /* synthetic */ void zzC(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i10 != 200 && i10 != 204) {
            if (i10 == 304) {
                i10 = 304;
            }
            zzaA().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th2);
        }
        if (th2 == null) {
            zzm().zzn.zza(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", HttpUrl.FRAGMENT_ENCODE_SET);
                    String optString2 = jSONObject.optString("gclid", HttpUrl.FRAGMENT_ENCODE_SET);
                    double optDouble = jSONObject.optDouble(PaymentConstants.TIMESTAMP, 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        zzaA().zzc().zza("Deferred Deep Link is empty.");
                        return;
                    }
                    zzlo zzv = zzv();
                    zzge zzgeVar = zzv.zzt;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = zzv.zzt.zze.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.zzt.zzG("auto", "_cmp", bundle);
                        zzlo zzv2 = zzv();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = zzv2.zzt.zze.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong(PaymentConstants.TIMESTAMP, Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    zzv2.zzt.zze.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e10) {
                                zzv2.zzt.zzaA().zzd().zzb("Failed to persist Deferred Deep Link. exception", e10);
                                return;
                            }
                        }
                        return;
                    }
                    zzaA().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e11) {
                    zzaA().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e11);
                    return;
                }
            }
            zzaA().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        zzaA().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th2);
    }

    public final void zzD() {
        this.zzG++;
    }

    public final void zzE() {
        zzaB().zzg();
        zzR(zzr());
        String zzl = zzh().zzl();
        Pair zzb = zzm().zzb(zzl);
        if (this.zzk.zzr() && !((Boolean) zzb.second).booleanValue() && !TextUtils.isEmpty((CharSequence) zzb.first)) {
            zzin zzr = zzr();
            zzr.zzv();
            ConnectivityManager connectivityManager = (ConnectivityManager) zzr.zzt.zze.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                zzlo zzv = zzv();
                zzh().zzt.zzk.zzh();
                URL zzE = zzv.zzE(77000L, zzl, (String) zzb.first, zzm().zzo.zza() - 1);
                if (zzE != null) {
                    zzin zzr2 = zzr();
                    zzgc zzgcVar = new zzgc(this);
                    zzr2.zzg();
                    zzr2.zzv();
                    Preconditions.checkNotNull(zzE);
                    Preconditions.checkNotNull(zzgcVar);
                    zzr2.zzt.zzaB().zzo(new zzim(zzr2, zzl, zzE, null, null, zzgcVar));
                    return;
                }
                return;
            }
            a.v(this, "Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzaA().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    public final void zzF(boolean z10) {
        this.zzE = Boolean.valueOf(z10);
    }

    public final void zzG(boolean z10) {
        zzaB().zzg();
        this.zzF = z10;
    }

    public final void zzH(com.google.android.gms.internal.measurement.zzcl zzclVar) {
        zzai zzaiVar;
        zzaB().zzg();
        zzai zzc = zzm().zzc();
        zzfj zzm = zzm();
        zzge zzgeVar = zzm.zzt;
        zzm.zzg();
        int i10 = 100;
        int i11 = zzm.zza().getInt("consent_source", 100);
        zzag zzagVar = this.zzk;
        zzge zzgeVar2 = zzagVar.zzt;
        Boolean zzk = zzagVar.zzk("google_analytics_default_allow_ad_storage");
        zzag zzagVar2 = this.zzk;
        zzge zzgeVar3 = zzagVar2.zzt;
        Boolean zzk2 = zzagVar2.zzk("google_analytics_default_allow_analytics_storage");
        if ((zzk != null || zzk2 != null) && zzm().zzl(-10)) {
            zzaiVar = new zzai(zzk, zzk2);
            i10 = -10;
        } else {
            if (!TextUtils.isEmpty(zzh().zzm()) && (i11 == 0 || i11 == 30 || i11 == 10 || i11 == 30 || i11 == 30 || i11 == 40)) {
                zzq().zzS(zzai.zza, -10, this.zzc);
            } else if (TextUtils.isEmpty(zzh().zzm()) && zzclVar != null && zzclVar.zzg != null && zzm().zzl(30)) {
                zzaiVar = zzai.zza(zzclVar.zzg);
                if (!zzaiVar.equals(zzai.zza)) {
                    i10 = 30;
                }
            }
            zzaiVar = null;
        }
        if (zzaiVar != null) {
            zzq().zzS(zzaiVar, i10, this.zzc);
            zzc = zzaiVar;
        }
        zzq().zzV(zzc);
        if (zzm().zzc.zza() == 0) {
            zzaA().zzj().zzb("Persisting first open", Long.valueOf(this.zzc));
            zzm().zzc.zzb(this.zzc);
        }
        zzq().zzb.zzc();
        if (!zzM()) {
            if (zzJ()) {
                if (!zzv().zzae("android.permission.INTERNET")) {
                    a.r(this, "App is missing INTERNET permission");
                }
                if (!zzv().zzae("android.permission.ACCESS_NETWORK_STATE")) {
                    a.r(this, "App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.packageManager(this.zze).isCallerInstantApp() && !this.zzk.zzx()) {
                    if (!zzlo.zzal(this.zze)) {
                        a.r(this, "AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zzlo.zzam(this.zze, false)) {
                        a.r(this, "AppMeasurementService not registered/enabled");
                    }
                }
                a.r(this, "Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                zzlo zzv = zzv();
                String zzm2 = zzh().zzm();
                zzfj zzm3 = zzm();
                zzm3.zzg();
                String string = zzm3.zza().getString("gmp_app_id", null);
                String zzk3 = zzh().zzk();
                zzfj zzm4 = zzm();
                zzm4.zzg();
                if (zzv.zzao(zzm2, string, zzk3, zzm4.zza().getString("admob_app_id", null))) {
                    zzaA().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    zzfj zzm5 = zzm();
                    zzm5.zzg();
                    Boolean zzd2 = zzm5.zzd();
                    SharedPreferences.Editor edit = zzm5.zza().edit();
                    edit.clear();
                    edit.apply();
                    if (zzd2 != null) {
                        zzm5.zzh(zzd2);
                    }
                    zzi().zzj();
                    this.zzy.zzs();
                    this.zzy.zzr();
                    zzm().zzc.zzb(this.zzc);
                    zzm().zze.zzb(null);
                }
                zzfj zzm6 = zzm();
                String zzm7 = zzh().zzm();
                zzm6.zzg();
                SharedPreferences.Editor edit2 = zzm6.zza().edit();
                edit2.putString("gmp_app_id", zzm7);
                edit2.apply();
                zzfj zzm8 = zzm();
                String zzk4 = zzh().zzk();
                zzm8.zzg();
                SharedPreferences.Editor edit3 = zzm8.zza().edit();
                edit3.putString("admob_app_id", zzk4);
                edit3.apply();
            }
            if (!zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                zzm().zze.zzb(null);
            }
            zzq().zzO(zzm().zze.zza());
            zzos.zzc();
            if (this.zzk.zzs(null, zzeh.zzae)) {
                try {
                    zzv().zzt.zze.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzm().zzp.zza())) {
                        zzaA().zzk().zza("Remote config removed with active feature rollouts");
                        zzm().zzp.zzb(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                boolean zzJ = zzJ();
                if (!zzm().zzj() && !this.zzk.zzv()) {
                    zzm().zzi(!zzJ);
                }
                if (zzJ) {
                    zzq().zzz();
                }
                zzu().zza.zza();
                zzt().zzu(new AtomicReference());
                zzt().zzH(zzm().zzs.zza());
            }
        }
        zzm().zzi.zza(true);
    }

    public final boolean zzI() {
        if (this.zzE != null && this.zzE.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean zzJ() {
        if (zza() == 0) {
            return true;
        }
        return false;
    }

    public final boolean zzK() {
        zzaB().zzg();
        return this.zzF;
    }

    @Pure
    public final boolean zzL() {
        return TextUtils.isEmpty(this.zzf);
    }

    public final boolean zzM() {
        boolean z10;
        if (this.zzB) {
            zzaB().zzg();
            Boolean bool = this.zzC;
            if (bool == null || this.zzD == 0 || (!bool.booleanValue() && Math.abs(this.zzr.elapsedRealtime() - this.zzD) > 1000)) {
                this.zzD = this.zzr.elapsedRealtime();
                boolean z11 = true;
                if (zzv().zzae("android.permission.INTERNET") && zzv().zzae("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zze).isCallerInstantApp() || this.zzk.zzx() || (zzlo.zzal(this.zze) && zzlo.zzam(this.zze, false)))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                this.zzC = valueOf;
                if (valueOf.booleanValue()) {
                    if (!zzv().zzY(zzh().zzm(), zzh().zzk()) && TextUtils.isEmpty(zzh().zzk())) {
                        z11 = false;
                    }
                    this.zzC = Boolean.valueOf(z11);
                }
            }
            return this.zzC.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    public final boolean zzN() {
        return this.zzi;
    }

    public final int zza() {
        zzaB().zzg();
        if (this.zzk.zzv()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzaB().zzg();
        if (!this.zzF) {
            return 8;
        }
        Boolean zzd2 = zzm().zzd();
        if (zzd2 != null) {
            if (zzd2.booleanValue()) {
                return 0;
            }
            return 3;
        }
        zzag zzagVar = this.zzk;
        zzab zzabVar = zzagVar.zzt.zzj;
        Boolean zzk = zzagVar.zzk("firebase_analytics_collection_enabled");
        if (zzk != null) {
            if (zzk.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.zza;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        }
        if (this.zzE == null || this.zzE.booleanValue()) {
            return 0;
        }
        return 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    @Pure
    public final zzeu zzaA() {
        zzR(this.zzm);
        return this.zzm;
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    @Pure
    public final zzgb zzaB() {
        zzR(this.zzn);
        return this.zzn;
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    @Pure
    public final Context zzaw() {
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    @Pure
    public final Clock zzax() {
        return this.zzr;
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    @Pure
    public final zzab zzay() {
        return this.zzj;
    }

    @Pure
    public final zzd zzd() {
        zzd zzdVar = this.zzu;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzag zzf() {
        return this.zzk;
    }

    @Pure
    public final zzaq zzg() {
        zzR(this.zzz);
        return this.zzz;
    }

    @Pure
    public final zzel zzh() {
        zzQ(this.zzA);
        return this.zzA;
    }

    @Pure
    public final zzen zzi() {
        zzQ(this.zzx);
        return this.zzx;
    }

    @Pure
    public final zzep zzj() {
        return this.zzq;
    }

    public final zzeu zzl() {
        zzeu zzeuVar = this.zzm;
        if (zzeuVar == null || !zzeuVar.zzy()) {
            return null;
        }
        return zzeuVar;
    }

    @Pure
    public final zzfj zzm() {
        zzP(this.zzl);
        return this.zzl;
    }

    @SideEffectFree
    public final zzgb zzo() {
        return this.zzn;
    }

    @Pure
    public final zzij zzq() {
        zzQ(this.zzt);
        return this.zzt;
    }

    @Pure
    public final zzin zzr() {
        zzR(this.zzv);
        return this.zzv;
    }

    @Pure
    public final zziy zzs() {
        zzQ(this.zzs);
        return this.zzs;
    }

    @Pure
    public final zzjy zzt() {
        zzQ(this.zzy);
        return this.zzy;
    }

    @Pure
    public final zzko zzu() {
        zzQ(this.zzo);
        return this.zzo;
    }

    @Pure
    public final zzlo zzv() {
        zzP(this.zzp);
        return this.zzp;
    }

    @Pure
    public final String zzw() {
        return this.zzf;
    }

    @Pure
    public final String zzx() {
        return this.zzg;
    }

    @Pure
    public final String zzy() {
        return this.zzh;
    }

    @Pure
    public final String zzz() {
        return this.zzw;
    }
}
