package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    final hp.o f11608a;

    /* renamed from: b, reason: collision with root package name */
    private final hp.k f11609b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11610c;

    public t(Context context, hp.k kVar) {
        String str;
        this.f11610c = context.getPackageName();
        this.f11609b = kVar;
        hp.k kVar2 = hp.p.f18663a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            str = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                            String str2 = Build.TAGS;
                            if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                            }
                        }
                        Intent intent = u.f11611a;
                        q qVar = new Object() { // from class: com.google.android.play.core.integrity.q
                        };
                        this.f11608a = new hp.o(context, kVar, intent);
                        return;
                    }
                }
                Object[] objArr = new Object[0];
                hp.k kVar3 = hp.p.f18663a;
                kVar3.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    Log.w("PlayCore", hp.k.b(kVar3.f18642a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Object[] objArr2 = new Object[0];
        kVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", hp.k.b(kVar.f18642a, "Phonesky is not installed.", objArr2));
        }
        this.f11608a = null;
    }

    public static Bundle a(t tVar, byte[] bArr, Long l10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", tVar.f11610c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new hp.e(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hp.e eVar = (hp.e) it.next();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", eVar.f18639a);
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f11608a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            this.f11609b.a("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            hp.o oVar = this.f11608a;
            r rVar = new r(this, taskCompletionSource, decode, cloudProjectNumber, taskCompletionSource, integrityTokenRequest);
            synchronized (oVar.f18655f) {
                oVar.f18654e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new ep.m(1, oVar, taskCompletionSource));
            }
            synchronized (oVar.f18655f) {
                try {
                    if (oVar.f18660k.getAndIncrement() > 0) {
                        hp.k kVar = oVar.f18651b;
                        Object[] objArr = new Object[0];
                        kVar.getClass();
                        if (Log.isLoggable("PlayCore", 3)) {
                            Log.d("PlayCore", hp.k.b(kVar.f18642a, "Already connected to the service.", objArr));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            oVar.a().post(new hp.m(oVar, rVar.c(), rVar));
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
