package com.google.android.recaptcha;

import android.app.Application;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzb;
import com.google.android.recaptcha.internal.zzp;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import yk.g;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/google/android/recaptcha/Recaptcha;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/app/Application;", "application", HttpUrl.FRAGMENT_ENCODE_SET, "siteKey", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "getTasksClient", "Lut/l;", "Lcom/google/android/recaptcha/RecaptchaClient;", "getClient-0E7RQCE", "(Landroid/app/Application;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "getClient", "<init>", "()V", "java.com.google.android.libraries.abuse.recaptcha.enterprise_enterprise"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Recaptcha {

    @NotNull
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    @NotNull
    public static final Task<RecaptchaTasksClient> getTasksClient(@NonNull Application application, @NonNull String siteKey) {
        return zzb.zza(g.d(zzp.zzb(), null, new Recaptcha$getTasksClient$1(application, siteKey, null), 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @androidx.annotation.NonNull
    /* renamed from: getClient-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m19getClient0E7RQCE(@androidx.annotation.NonNull android.app.Application r6, @androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.NonNull yt.a<? super ut.l<? extends com.google.android.recaptcha.RecaptchaClient>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zza
            zt.a r1 = zt.a.f42823a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.n.b(r8)     // Catch: java.lang.Throwable -> L27
            goto L4d
        L27:
            r6 = move-exception
            goto L52
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            ut.n.b(r8)
            ut.l$a r8 = ut.l.INSTANCE     // Catch: java.lang.Throwable -> L27
            qu.f0 r8 = com.google.android.recaptcha.internal.zzp.zzb()     // Catch: java.lang.Throwable -> L27
            kotlin.coroutines.CoroutineContext r8 = r8.H()     // Catch: java.lang.Throwable -> L27
            com.google.android.recaptcha.Recaptcha$getClient$2$1 r2 = new com.google.android.recaptcha.Recaptcha$getClient$2$1     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L27
            r0.zzc = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r8 = yk.g.e0(r8, r2, r0)     // Catch: java.lang.Throwable -> L27
            if (r8 != r1) goto L4d
            return r1
        L4d:
            com.google.android.recaptcha.internal.zzaa r8 = (com.google.android.recaptcha.internal.zzaa) r8     // Catch: java.lang.Throwable -> L27
            ut.l$a r6 = ut.l.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L58
        L52:
            ut.l$a r7 = ut.l.INSTANCE
            ut.m r8 = ut.n.a(r6)
        L58:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m19getClient0E7RQCE(android.app.Application, java.lang.String, yt.a):java.lang.Object");
    }
}
