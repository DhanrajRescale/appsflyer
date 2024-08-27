package ep;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import k7.e2;
import k7.g1;
import k7.h2;
import k7.i1;
import k7.i2;
import k7.y1;
import nv.v0;
import retrofit2.HttpException;
import t.j0;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements OnCompleteListener, nv.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15793a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15794b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15795c;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.f15793a = i10;
        this.f15795c = obj;
        this.f15794b = obj2;
    }

    @Override // nv.k
    public void a(nv.h hVar, Throwable th2) {
        int i10 = this.f15793a;
        Object obj = this.f15794b;
        switch (i10) {
            case 0:
                ((CompletableFuture) obj).completeExceptionally(th2);
                return;
            case 1:
                ((CompletableFuture) obj).completeExceptionally(th2);
                return;
            default:
                ((nv.p) this.f15795c).f29237a.execute(new androidx.fragment.app.e(23, this, (nv.k) obj, th2));
                return;
        }
    }

    @Override // nv.k
    public void b(nv.h hVar, v0 v0Var) {
        int i10 = this.f15793a;
        Object obj = this.f15794b;
        switch (i10) {
            case 0:
                if (v0Var.f29302a.isSuccessful()) {
                    ((CompletableFuture) obj).complete(v0Var.f29303b);
                    return;
                } else {
                    ((CompletableFuture) obj).completeExceptionally(new HttpException(v0Var));
                    return;
                }
            case 1:
                ((CompletableFuture) obj).complete(v0Var);
                return;
            default:
                ((nv.p) this.f15795c).f29237a.execute(new androidx.fragment.app.e(22, this, (nv.k) obj, v0Var));
                return;
        }
    }

    public void c(y1 y1Var) {
        i2 i2Var = (i2) ((j0) this.f15794b).get(y1Var);
        if (i2Var == null) {
            i2Var = i2.a();
            ((j0) this.f15794b).put(y1Var, i2Var);
        }
        i2Var.f22420a |= 1;
    }

    public void d(y1 y1Var, v5.i iVar) {
        i2 i2Var = (i2) ((j0) this.f15794b).get(y1Var);
        if (i2Var == null) {
            i2Var = i2.a();
            ((j0) this.f15794b).put(y1Var, i2Var);
        }
        i2Var.f22422c = iVar;
        i2Var.f22420a |= 8;
    }

    public void e(y1 y1Var, v5.i iVar) {
        i2 i2Var = (i2) ((j0) this.f15794b).get(y1Var);
        if (i2Var == null) {
            i2Var = i2.a();
            ((j0) this.f15794b).put(y1Var, i2Var);
        }
        i2Var.f22421b = iVar;
        i2Var.f22420a |= 4;
    }

    public void f() {
        switch (this.f15793a) {
            case 0:
                ((j0) this.f15794b).clear();
                ((t.o) this.f15795c).a();
                return;
            default:
                int[] iArr = (int[]) this.f15794b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f15795c = null;
                return;
        }
    }

    public void g(int i10) {
        Object obj = this.f15794b;
        if (((int[]) obj) == null) {
            int[] iArr = new int[Math.max(i10, 10) + 1];
            this.f15794b = iArr;
            Arrays.fill(iArr, -1);
        } else if (i10 >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f15794b = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            Object obj2 = this.f15794b;
            Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    public View h(int i10, int i11, int i12, int i13) {
        int E;
        int i14;
        int F;
        int i15;
        View u10;
        g1 g1Var = (g1) ((h2) this.f15794b);
        int i16 = g1Var.f22360a;
        i1 i1Var = g1Var.f22361b;
        switch (i16) {
            case 0:
                E = i1Var.E();
                break;
            default:
                E = i1Var.G();
                break;
        }
        g1 g1Var2 = (g1) ((h2) this.f15794b);
        int i17 = g1Var2.f22360a;
        i1 i1Var2 = g1Var2.f22361b;
        switch (i17) {
            case 0:
                i14 = i1Var2.f22417n;
                F = i1Var2.F();
                break;
            default:
                i14 = i1Var2.f22418o;
                F = i1Var2.D();
                break;
        }
        int i18 = i14 - F;
        if (i11 > i10) {
            i15 = 1;
        } else {
            i15 = -1;
        }
        View view = null;
        while (i10 != i11) {
            g1 g1Var3 = (g1) ((h2) this.f15794b);
            int i19 = g1Var3.f22360a;
            i1 i1Var3 = g1Var3.f22361b;
            switch (i19) {
                case 0:
                    u10 = i1Var3.u(i10);
                    break;
                default:
                    u10 = i1Var3.u(i10);
                    break;
            }
            int b10 = ((g1) ((h2) this.f15794b)).b(u10);
            int a10 = ((g1) ((h2) this.f15794b)).a(u10);
            Object obj = this.f15795c;
            b5.f fVar = (b5.f) obj;
            fVar.f3277b = E;
            fVar.f3278c = i18;
            fVar.f3279d = b10;
            fVar.f3280e = a10;
            if (i12 != 0) {
                ((b5.f) obj).f3276a = i12;
                if (((b5.f) obj).a()) {
                    return u10;
                }
            }
            if (i13 != 0) {
                Object obj2 = this.f15795c;
                ((b5.f) obj2).f3276a = i13;
                if (((b5.f) obj2).a()) {
                    view = u10;
                }
            }
            i10 += i15;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int i(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f15794b
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.length
            if (r6 < r0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r5.f15795c
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L15
        L13:
            r0 = r1
            goto L72
        L15:
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r0 != 0) goto L1b
            goto L36
        L1b:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L21:
            if (r0 < 0) goto L36
            java.lang.Object r3 = r5.f15795c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            k7.e2 r3 = (k7.e2) r3
            int r4 = r3.f22337a
            if (r4 != r6) goto L33
            r2 = r3
            goto L36
        L33:
            int r0 = r0 + (-1)
            goto L21
        L36:
            if (r2 == 0) goto L3f
            java.lang.Object r0 = r5.f15795c
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L3f:
            java.lang.Object r0 = r5.f15795c
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L48:
            if (r2 >= r0) goto L5c
            java.lang.Object r3 = r5.f15795c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            k7.e2 r3 = (k7.e2) r3
            int r3 = r3.f22337a
            if (r3 < r6) goto L59
            goto L5d
        L59:
            int r2 = r2 + 1
            goto L48
        L5c:
            r2 = r1
        L5d:
            if (r2 == r1) goto L13
            java.lang.Object r0 = r5.f15795c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            k7.e2 r0 = (k7.e2) r0
            java.lang.Object r3 = r5.f15795c
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.f22337a
        L72:
            if (r0 != r1) goto L82
            java.lang.Object r0 = r5.f15794b
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r6 = r5.f15794b
            int[] r6 = (int[]) r6
            int r6 = r6.length
            return r6
        L82:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.f15794b
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r2 = r5.f15794b
            int[] r2 = (int[]) r2
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.m.i(int):int");
    }

    public boolean j(View view) {
        int E;
        int i10;
        int F;
        b5.f fVar = (b5.f) this.f15795c;
        g1 g1Var = (g1) ((h2) this.f15794b);
        int i11 = g1Var.f22360a;
        i1 i1Var = g1Var.f22361b;
        switch (i11) {
            case 0:
                E = i1Var.E();
                break;
            default:
                E = i1Var.G();
                break;
        }
        g1 g1Var2 = (g1) ((h2) this.f15794b);
        int i12 = g1Var2.f22360a;
        i1 i1Var2 = g1Var2.f22361b;
        switch (i12) {
            case 0:
                i10 = i1Var2.f22417n;
                F = i1Var2.F();
                break;
            default:
                i10 = i1Var2.f22418o;
                F = i1Var2.D();
                break;
        }
        int i13 = i10 - F;
        int b10 = ((g1) ((h2) this.f15794b)).b(view);
        int a10 = ((g1) ((h2) this.f15794b)).a(view);
        fVar.f3277b = E;
        fVar.f3278c = i13;
        fVar.f3279d = b10;
        fVar.f3280e = a10;
        Object obj = this.f15795c;
        ((b5.f) obj).f3276a = 24579;
        return ((b5.f) obj).a();
    }

    public void k(int i10, int i11) {
        int[] iArr = (int[]) this.f15794b;
        if (iArr != null && i10 < iArr.length) {
            int i12 = i10 + i11;
            g(i12);
            int[] iArr2 = (int[]) this.f15794b;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill((int[]) this.f15794b, i10, i12, -1);
            List list = (List) this.f15795c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    e2 e2Var = (e2) ((List) this.f15795c).get(size);
                    int i13 = e2Var.f22337a;
                    if (i13 >= i10) {
                        e2Var.f22337a = i13 + i11;
                    }
                }
            }
        }
    }

    public void l(int i10, int i11) {
        int[] iArr = (int[]) this.f15794b;
        if (iArr != null && i10 < iArr.length) {
            int i12 = i10 + i11;
            g(i12);
            int[] iArr2 = (int[]) this.f15794b;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = (int[]) this.f15794b;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            List list = (List) this.f15795c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    e2 e2Var = (e2) ((List) this.f15795c).get(size);
                    int i13 = e2Var.f22337a;
                    if (i13 >= i10) {
                        if (i13 < i12) {
                            ((List) this.f15795c).remove(size);
                        } else {
                            e2Var.f22337a = i13 - i11;
                        }
                    }
                }
            }
        }
    }

    public v5.i m(y1 y1Var, int i10) {
        i2 i2Var;
        v5.i iVar;
        int d10 = ((j0) this.f15794b).d(y1Var);
        if (d10 >= 0 && (i2Var = (i2) ((j0) this.f15794b).j(d10)) != null) {
            int i11 = i2Var.f22420a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i2Var.f22420a = i12;
                if (i10 == 4) {
                    iVar = i2Var.f22421b;
                } else if (i10 == 8) {
                    iVar = i2Var.f22422c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    ((j0) this.f15794b).h(d10);
                    i2Var.f22420a = 0;
                    i2Var.f22421b = null;
                    i2Var.f22422c = null;
                    i2.f22419d.b(i2Var);
                }
                return iVar;
            }
        }
        return null;
    }

    public void n(y1 y1Var) {
        i2 i2Var = (i2) ((j0) this.f15794b).get(y1Var);
        if (i2Var == null) {
            return;
        }
        i2Var.f22420a &= -2;
    }

    public void o(y1 y1Var) {
        int i10 = ((t.o) this.f15795c).i() - 1;
        while (true) {
            if (i10 < 0) {
                break;
            }
            if (y1Var == ((t.o) this.f15795c).j(i10)) {
                t.o oVar = (t.o) this.f15795c;
                Object[] objArr = oVar.f34888c;
                Object obj = objArr[i10];
                Object obj2 = t.p.f34890a;
                if (obj != obj2) {
                    objArr[i10] = obj2;
                    oVar.f34886a = true;
                }
            } else {
                i10--;
            }
        }
        i2 i2Var = (i2) ((j0) this.f15794b).remove(y1Var);
        if (i2Var != null) {
            i2Var.f22420a = 0;
            i2Var.f22421b = null;
            i2Var.f22422c = null;
            i2.f22419d.b(i2Var);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f15793a) {
            case 0:
                q qVar = (q) this.f15795c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f15794b;
                synchronized (qVar.f15808f) {
                    qVar.f15807e.remove(taskCompletionSource);
                }
                return;
            case 1:
                hp.o oVar = (hp.o) this.f15795c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f15794b;
                synchronized (oVar.f18655f) {
                    oVar.f18654e.remove(taskCompletionSource2);
                }
                return;
            case 2:
                GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f15795c;
                String str = (String) this.f15794b;
                if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
                    List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        q.f a10 = new q.e().a();
                        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                        a10.a(genericIdpActivity, (Uri) task.getResult());
                        return;
                    } else {
                        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                        intent.putExtra("com.android.browser.application_id", str);
                        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                        intent.addFlags(1073741824);
                        intent.addFlags(268435456);
                        genericIdpActivity.startActivity(intent);
                        return;
                    }
                }
                Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                genericIdpActivity.zze(str, null);
                return;
            default:
                RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.f15795c;
                String str2 = (String) this.f15794b;
                recaptchaActivity.getClass();
                if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
                    List<ResolveInfo> queryIntentServices2 = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (queryIntentServices2 != null && !queryIntentServices2.isEmpty()) {
                        q.f a11 = new q.e().a();
                        Intent intent2 = a11.f31447a;
                        intent2.addFlags(1073741824);
                        intent2.addFlags(268435456);
                        a11.a(recaptchaActivity, (Uri) task.getResult());
                        return;
                    }
                    Intent intent3 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent3.putExtra("com.android.browser.application_id", str2);
                    intent3.addFlags(1073741824);
                    intent3.addFlags(268435456);
                    recaptchaActivity.startActivity(intent3);
                    return;
                }
                Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                recaptchaActivity.zze(str2, null);
                return;
        }
    }

    public /* synthetic */ m(int i10) {
        this.f15793a = i10;
        if (i10 != 1) {
            this.f15794b = new j0();
            this.f15795c = new t.o();
        }
    }

    public /* synthetic */ m(g1 g1Var) {
        this.f15793a = 2;
        this.f15794b = g1Var;
        this.f15795c = new b5.f();
    }
}
