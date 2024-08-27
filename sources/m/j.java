package m;

import android.app.Application;
import android.graphics.Bitmap;
import android.os.Process;
import android.util.Log;
import android.view.View;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.assetgro.stockgro.ui.profile.self.ImageCropActivity;
import com.assetgro.stockgro.ui.social.presentation.slider.ImageSliderActivity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzade;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthMissingActivityForRecaptchaException;
import com.linkedin.android.spyglass.ui.MentionsEditText;
import com.takusemba.cropme.CropLayout;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25589a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25590b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f25591c;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f25589a = i10;
        this.f25591c = obj;
        this.f25590b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.m mVar;
        int i10;
        int i11 = 1;
        int i12 = 0;
        switch (this.f25589a) {
            case 0:
                n nVar = (n) this.f25591c;
                l.o oVar = nVar.f25633c;
                if (oVar != null && (mVar = oVar.f23640e) != null) {
                    mVar.n(oVar);
                }
                View view = (View) nVar.f25638h;
                if (view != null && view.getWindowToken() != null) {
                    h hVar = (h) this.f25590b;
                    if (!hVar.b()) {
                        if (hVar.f23551f != null) {
                            hVar.d(0, 0, false, false);
                        }
                    }
                    nVar.f25650t = (h) this.f25590b;
                }
                nVar.f25652v = null;
                return;
            case 1:
                ((q.c) this.f25591c).getClass();
                throw null;
            case 2:
                ((q3.i) this.f25590b).f31616a = this.f25591c;
                return;
            case 3:
                ((Application) this.f25590b).unregisterActivityLifecycleCallbacks((q3.i) this.f25591c);
                return;
            case 4:
                try {
                    Method method = q3.j.f31625d;
                    Object obj = this.f25591c;
                    if (method != null) {
                        method.invoke(this.f25590b, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        q3.j.f31626e.invoke(this.f25590b, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e10) {
                    if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                        throw e10;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 5:
                g7.c0 c0Var = (g7.c0) ((AtomicReference) this.f25590b).get();
                if (c0Var != null) {
                    Iterator it = ((g7.m) this.f25591c).f16907j.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(c0Var);
                    }
                    return;
                }
                return;
            case 6:
                ((l7.l) this.f25591c).getClass();
                throw null;
            case 7:
                Object obj2 = this.f25591c;
                try {
                    ((Runnable) this.f25590b).run();
                    return;
                } finally {
                    ((l7.y) obj2).a();
                }
            case 8:
                try {
                    qu.h hVar2 = (qu.h) this.f25590b;
                    Object obj3 = ((op.a) this.f25591c).get();
                    l.Companion companion = ut.l.INSTANCE;
                    hVar2.resumeWith(obj3);
                    return;
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause == null) {
                        cause = th3;
                    }
                    if (th3 instanceof CancellationException) {
                        ((qu.h) this.f25590b).r(cause);
                        return;
                    }
                    qu.h hVar3 = (qu.h) this.f25590b;
                    l.Companion companion2 = ut.l.INSTANCE;
                    hVar3.resumeWith(ut.n.a(cause));
                    return;
                }
            case 9:
                androidx.work.u.w().u(c8.a.f8049d, String.format("Scheduling work %s", ((j8.k) this.f25590b).f21074a), new Throwable[0]);
                ((c8.a) this.f25591c).f8050a.f((j8.k) this.f25590b);
                return;
            case 10:
                for (g8.c cVar : (List) this.f25590b) {
                    Object obj4 = ((h8.d) this.f25591c).f18047e;
                    cVar.f17169b = obj4;
                    cVar.d(cVar.f17171d, obj4);
                }
                return;
            case 11:
                synchronized (((k8.g) this.f25591c).f22673c) {
                    try {
                        Object apply = ((k8.g) this.f25591c).f22674d.apply(this.f25590b);
                        Object obj5 = this.f25591c;
                        if (((k8.g) obj5).f22671a == null && apply != null) {
                            ((k8.g) obj5).f22671a = apply;
                            ((k8.g) obj5).f22675e.postValue(apply);
                        } else if (((k8.g) obj5).f22671a != null && !((k8.g) obj5).f22671a.equals(apply)) {
                            Object obj6 = this.f25591c;
                            ((k8.g) obj6).f22671a = apply;
                            ((k8.g) obj6).f22675e.postValue(apply);
                        }
                    } finally {
                    }
                }
                return;
            case 12:
                try {
                    ((Runnable) this.f25591c).run();
                    return;
                } finally {
                    ((k8.j) this.f25590b).a();
                }
            case 13:
                synchronized (((ConstraintTrackingWorker) this.f25591c).f2611b) {
                    if (((ConstraintTrackingWorker) this.f25591c).f2612c) {
                        ((ConstraintTrackingWorker) this.f25591c).f2613d.j(new Object());
                    } else {
                        ((ConstraintTrackingWorker) this.f25591c).f2613d.l((op.a) this.f25590b);
                    }
                }
                return;
            case 14:
                Log.i("LicenseChecker", "Check timed out.");
                of.b bVar = (of.b) this.f25591c;
                of.c cVar2 = bVar.f29978c;
                of.e eVar = bVar.f29976a;
                SecureRandom secureRandom = of.c.f29979j;
                cVar2.b(eVar);
                of.c.a(bVar.f29978c, bVar.f29976a);
                return;
            case 15:
                ImageSliderActivity imageSliderActivity = (ImageSliderActivity) this.f25591c;
                ba.y0 y0Var = (ba.y0) imageSliderActivity.w();
                Integer num = imageSliderActivity.f10131k;
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                y0Var.f6701s.c(i10, false);
                return;
            case 16:
                Process.setThreadPriority(10);
                ((Runnable) this.f25590b).run();
                return;
            case 17:
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(pp.g.e((String) this.f25590b));
                zp.h hVar4 = firebaseAuth.f11632f;
                if (hVar4 != null) {
                    zzade zzadeVar = ((aq.g0) hVar4).f2716a;
                    zzadeVar.zzj();
                    Task zzj = firebaseAuth.f11631e.zzj(firebaseAuth.f11627a, hVar4, zzadeVar.zzf(), new zp.z(firebaseAuth, i11));
                    aq.f.f2711e.v("Token refreshing started", new Object[0]);
                    zzj.addOnFailureListener(new ll.o(this, 13));
                    return;
                }
                return;
            case 18:
                ((zp.r) this.f25590b).onVerificationFailed((FirebaseAuthMissingActivityForRecaptchaException) this.f25591c);
                return;
            case 19:
                Iterator it2 = ((FirebaseAuth) this.f25590b).f11629c.iterator();
                if (!it2.hasNext()) {
                    Iterator it3 = ((FirebaseAuth) this.f25590b).f11628b.iterator();
                    if (!it3.hasNext()) {
                        return;
                    }
                    a3.a.u(it3.next());
                    throw null;
                }
                a3.a.u(it2.next());
                throw null;
            case 20:
                MentionsEditText mentionsEditText = (MentionsEditText) this.f25591c;
                if (mentionsEditText.isPressed()) {
                    mentionsEditText.f12085m = true;
                    if (((xr.a) this.f25590b) != null) {
                        xr.d mentionsText = mentionsEditText.getMentionsText();
                        mentionsEditText.setSelection(mentionsText.getSpanStart((xr.a) this.f25590b), mentionsText.getSpanEnd((xr.a) this.f25590b));
                        mentionsEditText.b();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                Iterator it4 = ((CropLayout) ((z2.e) this.f25590b).f41922b).f12123d.iterator();
                while (it4.hasNext()) {
                    ih.n nVar2 = (ih.n) it4.next();
                    Bitmap bitmap = (Bitmap) this.f25591c;
                    Intrinsics.b(bitmap, "result");
                    nVar2.getClass();
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    ImageCropActivity imageCropActivity = nVar2.f20018a;
                    yk.g.H(yk.j.X0(imageCropActivity), qu.r0.f32256b, null, new ih.m(imageCropActivity, bitmap, null), 2);
                }
                return;
            case 22:
                ((at.e) ((mt.f) this.f25591c).f27994a).e((mt.r) this.f25590b);
                return;
            case 23:
                pt.g gVar = (pt.g) this.f25590b;
                ft.e eVar2 = gVar.f31354b;
                ct.b b10 = ((pt.k) this.f25591c).b(gVar);
                eVar2.getClass();
                ft.b.d(eVar2, b10);
                return;
            case 24:
                ((pt.a0) this.f25590b).getClass();
                ((pt.b0) this.f25591c).getClass();
                throw null;
            case 25:
                ((qu.h) this.f25591c).q((qu.b0) this.f25590b, Unit.f23355a);
                return;
            case 26:
                ((qu.h) this.f25590b).q((ru.d) this.f25591c, Unit.f23355a);
                return;
            case 27:
                break;
            default:
                yt.a b11 = zt.f.b((yt.a) this.f25590b);
                Exception exc = (Exception) this.f25591c;
                l.Companion companion3 = ut.l.INSTANCE;
                b11.resumeWith(ut.n.a(exc));
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f25590b).run();
            } catch (Throwable th4) {
                el.l.k0(kotlin.coroutines.k.f23369a, th4);
            }
            vu.n nVar3 = (vu.n) this.f25591c;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vu.n.f38389h;
            Runnable f02 = nVar3.f0();
            if (f02 != null) {
                this.f25590b = f02;
                i12++;
                if (i12 >= 16 && nVar3.f38390c.d0()) {
                    nVar3.f38390c.b0(nVar3, this);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, int i10) {
        this.f25589a = i10;
        this.f25590b = obj;
        this.f25591c = obj2;
    }

    public j(aq.f fVar, String str) {
        this.f25589a = 17;
        this.f25591c = fVar;
        this.f25590b = Preconditions.checkNotEmpty(str);
    }

    public j(g7.m mVar) {
        this.f25589a = 5;
        this.f25591c = mVar;
        this.f25590b = new AtomicReference(null);
    }

    public j(MentionsEditText mentionsEditText) {
        this.f25589a = 20;
        this.f25591c = mentionsEditText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(MentionsEditText mentionsEditText, int i10) {
        this(mentionsEditText);
        this.f25589a = 20;
    }
}
