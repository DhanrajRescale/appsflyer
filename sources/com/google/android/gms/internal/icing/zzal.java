package com.google.android.gms.internal.icing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;
import nn.d;

/* loaded from: classes2.dex */
public final class zzal implements AppIndexApi, zzz {
    private static final String zza = "zzal";

    public static Intent zzb(String str, Uri uri) {
        zzc(str, uri);
        if (uri != null && zzd(uri)) {
            return new Intent("android.intent.action.VIEW", uri);
        }
        if (uri != null && zze(uri)) {
            List<String> pathSegments = uri.getPathSegments();
            String str2 = pathSegments.get(0);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(str2);
            if (pathSegments.size() > 1) {
                builder.authority(pathSegments.get(1));
                for (int i10 = 2; i10 < pathSegments.size(); i10++) {
                    builder.appendPath(pathSegments.get(i10));
                }
            } else {
                String str3 = zza;
                String valueOf = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 88);
                sb2.append("The app URI must have the format: android-app://<package_name>/<scheme>/<path>. But got ");
                sb2.append(valueOf);
                Log.e(str3, sb2.toString());
            }
            builder.encodedQuery(uri.getEncodedQuery());
            builder.encodedFragment(uri.getEncodedFragment());
            return new Intent("android.intent.action.VIEW", builder.build());
        }
        String valueOf2 = String.valueOf(uri);
        throw new RuntimeException(d.o(new StringBuilder(valueOf2.length() + 70), "appIndexingUri is neither an HTTP(S) URL nor an \"android-app://\" URL: ", valueOf2));
    }

    private static void zzc(String str, Uri uri) {
        if (uri != null && zzd(uri)) {
            String host = uri.getHost();
            if (host != null && host.isEmpty()) {
                String valueOf = String.valueOf(uri);
                throw new IllegalArgumentException(d.o(new StringBuilder(valueOf.length() + 98), "AppIndex: The web URL must have a host (follow the format http(s)://<host>/<path>). Provided URI: ", valueOf));
            }
            return;
        }
        if (uri != null && zze(uri)) {
            if (str != null && !str.equals(uri.getHost())) {
                String valueOf2 = String.valueOf(uri);
                throw new IllegalArgumentException(d.o(new StringBuilder(valueOf2.length() + 150), "AppIndex: The android-app URI host must match the package name and follow the format android-app://<package_name>/<scheme>/<host_path>. Provided URI: ", valueOf2));
            }
            List<String> pathSegments = uri.getPathSegments();
            if (!pathSegments.isEmpty() && !pathSegments.get(0).isEmpty()) {
                return;
            }
            String valueOf3 = String.valueOf(uri);
            throw new IllegalArgumentException(d.o(new StringBuilder(valueOf3.length() + 128), "AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/<host_path>). Provided URI: ", valueOf3));
        }
        String valueOf4 = String.valueOf(uri);
        throw new IllegalArgumentException(d.o(new StringBuilder(valueOf4.length() + 176), "AppIndex: The URI scheme must either be 'http(s)' or 'android-app'. If the latter, it must follow the format 'android-app://<package_name>/<scheme>/<host_path>'. Provided URI: ", valueOf4));
    }

    private static boolean zzd(Uri uri) {
        String scheme = uri.getScheme();
        if (!"http".equals(scheme) && !"https".equals(scheme)) {
            return false;
        }
        return true;
    }

    private static boolean zze(Uri uri) {
        return "android-app".equals(uri.getScheme());
    }

    private final PendingResult<Status> zzf(GoogleApiClient googleApiClient, Action action, int i10) {
        return zza(googleApiClient, zzaf.zza(action, System.currentTimeMillis(), googleApiClient.getContext().getPackageName(), i10));
    }

    @Override // com.google.android.gms.appindexing.AppIndexApi
    public final AppIndexApi.ActionResult action(GoogleApiClient googleApiClient, Action action) {
        return new zzah(this, zzf(googleApiClient, action, 1), action);
    }

    @Override // com.google.android.gms.appindexing.AppIndexApi
    public final PendingResult<Status> end(GoogleApiClient googleApiClient, Action action) {
        return zzf(googleApiClient, action, 2);
    }

    @Override // com.google.android.gms.appindexing.AppIndexApi
    public final PendingResult<Status> start(GoogleApiClient googleApiClient, Action action) {
        return zzf(googleApiClient, action, 1);
    }

    @Override // com.google.android.gms.appindexing.AppIndexApi
    public final PendingResult<Status> view(GoogleApiClient googleApiClient, Activity activity, Intent intent, String str, Uri uri, List<AppIndexApi.AppIndexingLink> list) {
        String packageName = googleApiClient.getContext().getPackageName();
        if (list != null) {
            Iterator<AppIndexApi.AppIndexingLink> it = list.iterator();
            while (it.hasNext()) {
                zzc(null, it.next().appIndexingUrl);
            }
        }
        return zza(googleApiClient, new zzx(packageName, intent, str, uri, null, list, 1));
    }

    @Override // com.google.android.gms.appindexing.AppIndexApi
    public final PendingResult<Status> viewEnd(GoogleApiClient googleApiClient, Activity activity, Intent intent) {
        String packageName = googleApiClient.getContext().getPackageName();
        zzw zzwVar = new zzw();
        zzwVar.zza(zzx.zza(packageName, intent));
        zzwVar.zzb(System.currentTimeMillis());
        zzwVar.zzc(0);
        zzwVar.zzf(2);
        return zza(googleApiClient, zzwVar.zzg());
    }

    public final PendingResult<Status> zza(GoogleApiClient googleApiClient, zzx... zzxVarArr) {
        return googleApiClient.enqueue(new zzag(this, googleApiClient, zzxVarArr));
    }

    @Override // com.google.android.gms.appindexing.AppIndexApi
    public final PendingResult<Status> view(GoogleApiClient googleApiClient, Activity activity, Uri uri, String str, Uri uri2, List<AppIndexApi.AppIndexingLink> list) {
        String packageName = googleApiClient.getContext().getPackageName();
        zzc(packageName, uri);
        Intent zzb = zzb(packageName, uri);
        String packageName2 = googleApiClient.getContext().getPackageName();
        if (list != null) {
            Iterator<AppIndexApi.AppIndexingLink> it = list.iterator();
            while (it.hasNext()) {
                zzc(null, it.next().appIndexingUrl);
            }
        }
        return zza(googleApiClient, new zzx(packageName2, zzb, str, uri2, null, list, 1));
    }

    @Override // com.google.android.gms.appindexing.AppIndexApi
    public final PendingResult<Status> viewEnd(GoogleApiClient googleApiClient, Activity activity, Uri uri) {
        Intent zzb = zzb(googleApiClient.getContext().getPackageName(), uri);
        String packageName = googleApiClient.getContext().getPackageName();
        zzw zzwVar = new zzw();
        zzwVar.zza(zzx.zza(packageName, zzb));
        zzwVar.zzb(System.currentTimeMillis());
        zzwVar.zzc(0);
        zzwVar.zzf(2);
        return zza(googleApiClient, zzwVar.zzg());
    }
}
