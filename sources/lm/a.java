package lm;

import am.d;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.util.Log;
import androidx.lifecycle.f0;
import cm.b;
import cm.c;
import cm.g;
import com.assetgro.stockgro.prod.R;
import com.firebase.ui.auth.data.model.IntentRequiredException;
import com.firebase.ui.auth.data.model.PendingIntentRequiredException;

/* loaded from: classes.dex */
public abstract class a implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f24938a;

    /* renamed from: b, reason: collision with root package name */
    public final c f24939b;

    /* renamed from: c, reason: collision with root package name */
    public final b f24940c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24941d;

    public a(c cVar) {
        this(cVar, null, cVar, R.string.fui_progress_dialog_loading);
    }

    public abstract void a(Exception exc);

    public abstract void b(Object obj);

    @Override // androidx.lifecycle.f0
    public final void d(Object obj) {
        d dVar = (d) obj;
        int i10 = dVar.f760a;
        g gVar = this.f24938a;
        if (i10 == 3) {
            gVar.f(this.f24941d);
            return;
        }
        gVar.b();
        if (!dVar.f763d) {
            int i11 = dVar.f760a;
            if (i11 == 1) {
                dVar.f763d = true;
                b(dVar.f761b);
                return;
            }
            if (i11 == 2) {
                dVar.f763d = true;
                b bVar = this.f24940c;
                Exception exc = dVar.f762c;
                if (bVar == null) {
                    c cVar = this.f24939b;
                    if (exc instanceof IntentRequiredException) {
                        IntentRequiredException intentRequiredException = (IntentRequiredException) exc;
                        cVar.startActivityForResult(intentRequiredException.f10899b, intentRequiredException.f10900c);
                        return;
                    } else if (exc instanceof PendingIntentRequiredException) {
                        PendingIntentRequiredException pendingIntentRequiredException = (PendingIntentRequiredException) exc;
                        PendingIntent pendingIntent = pendingIntentRequiredException.f10901b;
                        try {
                            cVar.startIntentSenderForResult(pendingIntent.getIntentSender(), pendingIntentRequiredException.f10902c, null, 0, 0, 0);
                            return;
                        } catch (IntentSender.SendIntentException e10) {
                            cVar.w(0, zl.d.d(e10));
                            return;
                        }
                    }
                } else if (exc instanceof IntentRequiredException) {
                    IntentRequiredException intentRequiredException2 = (IntentRequiredException) exc;
                    bVar.startActivityForResult(intentRequiredException2.f10899b, intentRequiredException2.f10900c);
                    return;
                } else if (exc instanceof PendingIntentRequiredException) {
                    PendingIntentRequiredException pendingIntentRequiredException2 = (PendingIntentRequiredException) exc;
                    PendingIntent pendingIntent2 = pendingIntentRequiredException2.f10901b;
                    try {
                        bVar.startIntentSenderForResult(pendingIntent2.getIntentSender(), pendingIntentRequiredException2.f10902c, null, 0, 0, 0, null);
                        return;
                    } catch (IntentSender.SendIntentException e11) {
                        ((c) bVar.requireActivity()).w(0, zl.d.d(e11));
                        return;
                    }
                }
                Log.e("AuthUI", "A sign-in error occurred.", exc);
                a(exc);
            }
        }
    }

    public a(c cVar, b bVar, g gVar, int i10) {
        this.f24939b = cVar;
        this.f24940c = bVar;
        if (cVar == null && bVar == null) {
            throw new IllegalStateException("ResourceObserver must be attached to an Activity or a Fragment");
        }
        this.f24938a = gVar;
        this.f24941d = i10;
    }
}
