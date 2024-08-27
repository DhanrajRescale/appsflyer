package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.internal.zzi;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public class GoogleSignInClient extends GoogleApi<GoogleSignInOptions> {
    private static final zzd zzbv = new zzd(null);

    @VisibleForTesting
    private static int zzbw = zzc.zzbx;

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public enum zzc {
        public static final int zzbx = 1;
        public static final int zzby = 2;
        public static final int zzbz = 3;
        public static final int zzca = 4;
        private static final /* synthetic */ int[] zzcb = {1, 2, 3, 4};

        public static int[] zzm() {
            return (int[]) zzcb.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static class zzd implements PendingResultUtil.ResultConverter<GoogleSignInResult, GoogleSignInAccount> {
        private zzd() {
        }

        public /* synthetic */ zzd(com.google.android.gms.auth.api.signin.zzc zzcVar) {
            this();
        }

        @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
        public final /* synthetic */ GoogleSignInAccount convert(GoogleSignInResult googleSignInResult) {
            return googleSignInResult.getSignInAccount();
        }
    }

    public GoogleSignInClient(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, new ApiExceptionMapper());
    }

    private final synchronized int zzl() {
        try {
            if (zzbw == zzc.zzbx) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                if (isGooglePlayServicesAvailable == 0) {
                    zzbw = zzc.zzca;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, isGooglePlayServicesAvailable, null) == null && DynamiteModule.getLocalVersion(applicationContext, "com.google.android.gms.auth.api.fallback") != 0) {
                    zzbw = zzc.zzbz;
                } else {
                    zzbw = zzc.zzby;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzbw;
    }

    @NonNull
    public Intent getSignInIntent() {
        Context applicationContext = getApplicationContext();
        int i10 = com.google.android.gms.auth.api.signin.zzc.zzbu[zzl() - 1];
        if (i10 != 1) {
            if (i10 != 2) {
                return zzi.zze(applicationContext, getApiOptions());
            }
            return zzi.zzc(applicationContext, getApiOptions());
        }
        return zzi.zzd(applicationContext, getApiOptions());
    }

    public Task<Void> revokeAccess() {
        boolean z10;
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        if (zzl() == zzc.zzbz) {
            z10 = true;
        } else {
            z10 = false;
        }
        return PendingResultUtil.toVoidTask(zzi.zzd(asGoogleApiClient, applicationContext, z10));
    }

    public Task<Void> signOut() {
        boolean z10;
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        if (zzl() == zzc.zzbz) {
            z10 = true;
        } else {
            z10 = false;
        }
        return PendingResultUtil.toVoidTask(zzi.zzc(asGoogleApiClient, applicationContext, z10));
    }

    public Task<GoogleSignInAccount> silentSignIn() {
        boolean z10;
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        GoogleSignInOptions apiOptions = getApiOptions();
        if (zzl() == zzc.zzbz) {
            z10 = true;
        } else {
            z10 = false;
        }
        return PendingResultUtil.toTask(zzi.zzc(asGoogleApiClient, applicationContext, apiOptions, z10), zzbv);
    }

    public GoogleSignInClient(@NonNull Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, (StatusExceptionMapper) new ApiExceptionMapper());
    }
}
