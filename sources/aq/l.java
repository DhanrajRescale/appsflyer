package aq;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzada;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class l implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntegrityManager f2742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f2743c;

    public l(x xVar, String str, IntegrityManager integrityManager) {
        this.f2743c = xVar;
        this.f2741a = str;
        this.f2742b = integrityManager;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            this.f2743c.f2764a = ((zzada) task.getResult()).zzb();
            return this.f2742b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(((zzada) task.getResult()).zzb())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f2741a.getBytes("UTF-8")), 11))).build());
        }
        Log.e("x", "Problem retrieving Play Integrity producer project:  ".concat(String.valueOf(task.getException().getMessage())));
        return Tasks.forException(task.getException());
    }
}
