package ll;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import aq.w;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.FirebaseNetworkException;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.inject.Provider;
import nv.c0;

/* loaded from: classes.dex */
public final class o implements ln.b, bo.a, qo.a, l.m, ep.c, OnFailureListener, Continuation, OnSuccessListener, fq.a, OnCanceledListener, kr.b, et.d, nv.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24936a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24937b;

    public /* synthetic */ o(int i10, Object obj) {
        this.f24936a = i10;
        this.f24937b = obj;
    }

    public static String l(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return a3.a.g(str, " : ", str2);
    }

    @Override // nv.j
    public final Object a(c0 c0Var) {
        nv.l lVar = new nv.l(c0Var);
        c0Var.v(new ep.m(1, this, lVar));
        return lVar;
    }

    @Override // et.d
    public final Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 2) {
            return ((et.b) this.f24937b).a(objArr[0], objArr[1]);
        }
        throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
    }

    @Override // qo.a
    public final void b(Typeface typeface) {
        mo.b bVar = (mo.b) this.f24937b;
        if (bVar.o(typeface)) {
            bVar.i(false);
        }
    }

    public final void c(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = (ArrayList) this.f24937b;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll((ArrayList) this.f24937b, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            ((ArrayList) this.f24937b).addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                ((ArrayList) this.f24937b).add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                ((ArrayList) this.f24937b).add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    @Override // nv.j
    public final Type d() {
        return (Type) this.f24937b;
    }

    @Override // kr.b
    public final mr.b e(String str, int i10, int i11, int i12, Map map) {
        if (i10 == 15) {
            return ((pr.g) this.f24937b).e("0".concat(String.valueOf(str)), 8, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(jr.h.A(i10)));
    }

    public final void f(Writer writer, Object obj) {
        hq.d dVar = (hq.d) this.f24937b;
        hq.e eVar = new hq.e(writer, dVar.f18674a, dVar.f18675b, dVar.f18676c, dVar.f18677d);
        eVar.g(obj);
        eVar.i();
        eVar.f18679b.flush();
    }

    public final void finalize() {
        switch (this.f24936a) {
            case 0:
                if (((m) this.f24937b) != null) {
                    g gVar = m.f24924h;
                    return;
                }
                return;
            default:
                super.finalize();
                return;
        }
    }

    public final int g() {
        int h10 = h();
        Object obj = this.f24937b;
        return Math.max(0, (h10 - ((SideSheetBehavior) obj).f11421l) - ((SideSheetBehavior) obj).f11423n);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        String packageName = ((Context) ((Provider) this.f24937b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final int h() {
        return ((SideSheetBehavior) this.f24937b).f11422m;
    }

    public final void i(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", l((String) this.f24937b, str, objArr));
        }
    }

    public final void j(String str, RemoteException remoteException, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", l((String) this.f24937b, str, objArr), remoteException);
        }
    }

    public final void k(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", l((String) this.f24937b, str, objArr));
        }
    }

    @Override // l.m
    public final void n(l.o oVar) {
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        ((CountDownLatch) this.f24937b).countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        long j10;
        switch (this.f24936a) {
            case 13:
                if (exc instanceof FirebaseNetworkException) {
                    Logger logger = aq.f.f2711e;
                    logger.v("Failure to refresh token; scheduling refresh after failure", new Object[0]);
                    aq.f fVar = (aq.f) ((m.j) this.f24937b).f25591c;
                    int i10 = (int) fVar.f2713b;
                    if (i10 != 30 && i10 != 60 && i10 != 120 && i10 != 240 && i10 != 480) {
                        if (i10 != 960) {
                            j10 = 30;
                        } else {
                            j10 = 960;
                        }
                    } else {
                        long j11 = fVar.f2713b;
                        j10 = j11 + j11;
                    }
                    fVar.f2713b = j10;
                    fVar.f2712a = (fVar.f2713b * 1000) + DefaultClock.getInstance().currentTimeMillis();
                    logger.v(nn.d.j("Scheduling refresh for ", fVar.f2712a), new Object[0]);
                    fVar.f2714c.postDelayed(fVar.f2715d, fVar.f2713b * 1000);
                    return;
                }
                return;
            default:
                ((CountDownLatch) this.f24937b).countDown();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.f24936a) {
            case 15:
                ((TaskCompletionSource) this.f24937b).setResult(new w((String) obj, null));
                return;
            default:
                ((CountDownLatch) this.f24937b).countDown();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        vl.b bVar = (vl.b) this.f24937b;
        if (!task.isSuccessful()) {
            Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) Preconditions.checkNotNull(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
            return bVar.r0("NO_RECAPTCHA");
        }
        return bVar.r0((String) task.getResult());
    }

    @Override // l.m
    public final boolean v(l.o oVar, MenuItem menuItem) {
        no.k kVar = (no.k) this.f24937b;
        int i10 = no.k.f29063f;
        kVar.getClass();
        Object obj = this.f24937b;
        if (((no.k) obj).f29068e != null && !((no.k) obj).f29068e.c(menuItem)) {
            return true;
        }
        return false;
    }

    @Override // ep.c
    public final Object zza() {
        Context context = ((dp.f) ((ep.c) this.f24937b)).f14447a.f15616b;
        if (context != null) {
            return new dp.l(context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public o(SideSheetBehavior sideSheetBehavior) {
        this.f24936a = 8;
        this.f24937b = sideSheetBehavior;
    }

    public /* synthetic */ o(Object obj, int i10) {
        this.f24936a = i10;
        this.f24937b = obj;
    }

    public o(String str) {
        this.f24936a = 9;
        this.f24937b = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public o(int i10, int i11) {
        this.f24936a = i10;
        if (i10 == 18) {
            this.f24937b = new CountDownLatch(1);
        } else if (i10 != 19) {
            this.f24937b = new Bundle();
        } else {
            this.f24937b = new pr.g(0);
        }
    }

    public o(int i10) {
        this.f24936a = 21;
        this.f24937b = new ArrayList(3);
    }

    public o(Context context) {
        boolean isEmpty;
        this.f24936a = 17;
        this.f24937b = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(r3.k.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = ((SharedPreferences) this.f24937b).getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    ((SharedPreferences) this.f24937b).edit().clear().commit();
                }
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o() {
        this(18, 0);
        this.f24936a = 18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(materialButtonToggleGroup, 4);
        this.f24936a = 4;
    }
}
