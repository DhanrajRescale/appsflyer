package h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.p002firebaseauthapi.zzaec;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class r0 implements l.b0, mo.d0 {

    /* renamed from: c, reason: collision with root package name */
    public static r0 f17734c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17735a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17736b;

    public /* synthetic */ r0(Object obj) {
        this.f17736b = obj;
    }

    public static void i(Context context) {
        r0 r0Var = f17734c;
        r0Var.f17735a = false;
        if (((BroadcastReceiver) r0Var.f17736b) != null) {
            a5.b.a(context).d((BroadcastReceiver) f17734c.f17736b);
        }
        f17734c.f17736b = null;
    }

    public static final zp.d0 j(Intent intent) {
        Preconditions.checkNotNull(intent);
        zzaec zzaecVar = (zzaec) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzaec.CREATOR);
        zzaecVar.zze(true);
        return zp.d0.S(zzaecVar);
    }

    public final void a(int i10) {
        yk.j.H0(!this.f17735a);
        ((SparseBooleanArray) this.f17736b).append(i10, true);
    }

    @Override // l.b0
    public final void b(l.o oVar, boolean z10) {
        m.n nVar;
        if (this.f17735a) {
            return;
        }
        this.f17735a = true;
        ActionMenuView actionMenuView = ((s0) this.f17736b).f17738g.f25780a.f1107a;
        if (actionMenuView != null && (nVar = actionMenuView.f981t) != null) {
            nVar.f();
            m.h hVar = nVar.f25651u;
            if (hVar != null && hVar.b()) {
                hVar.f23555j.dismiss();
            }
        }
        ((s0) this.f17736b).f17739h.onPanelClosed(108, oVar);
        this.f17735a = false;
    }

    public final b5.t c() {
        yk.j.H0(!this.f17735a);
        this.f17735a = true;
        return new b5.t((SparseBooleanArray) this.f17736b);
    }

    public final synchronized void d() {
        this.f17735a = false;
    }

    @Override // l.b0
    public final boolean e(l.o oVar) {
        ((s0) this.f17736b).f17739h.onMenuOpened(108, oVar);
        return true;
    }

    public final synchronized boolean f() {
        if (this.f17735a) {
            return false;
        }
        this.f17735a = true;
        notifyAll();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        if (r9 != false) goto L35;
     */
    @Override // mo.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final d4.d3 g(android.view.View r11, d4.d3 r12, v5.i r13) {
        /*
            r10 = this;
            d4.b3 r0 = r12.f13731a
            r1 = 7
            u3.c r1 = r0.f(r1)
            r2 = 32
            u3.c r0 = r0.f(r2)
            java.lang.Object r2 = r10.f17736b
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            int r3 = r1.f36705b
            r2.f11194w = r3
            boolean r2 = pn.e.o(r11)
            int r3 = r11.getPaddingBottom()
            int r4 = r11.getPaddingLeft()
            int r5 = r11.getPaddingRight()
            java.lang.Object r6 = r10.f17736b
            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r6
            boolean r7 = r6.f11186o
            if (r7 == 0) goto L3c
            int r3 = r12.a()
            r6.f11193v = r3
            int r3 = r13.f37740d
            java.lang.Object r6 = r10.f17736b
            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r6
            int r6 = r6.f11193v
            int r3 = r3 + r6
        L3c:
            java.lang.Object r6 = r10.f17736b
            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r6
            boolean r7 = r6.f11187p
            int r8 = r1.f36704a
            if (r7 == 0) goto L4e
            if (r2 == 0) goto L4b
            int r4 = r13.f37739c
            goto L4d
        L4b:
            int r4 = r13.f37737a
        L4d:
            int r4 = r4 + r8
        L4e:
            boolean r6 = r6.f11188q
            int r7 = r1.f36706c
            if (r6 == 0) goto L5d
            if (r2 == 0) goto L59
            int r13 = r13.f37737a
            goto L5b
        L59:
            int r13 = r13.f37739c
        L5b:
            int r5 = r13 + r7
        L5d:
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            java.lang.Object r2 = r10.f17736b
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            boolean r6 = r2.f11190s
            r9 = 1
            if (r6 == 0) goto L74
            int r6 = r13.leftMargin
            if (r6 == r8) goto L74
            r13.leftMargin = r8
            r6 = r9
            goto L75
        L74:
            r6 = 0
        L75:
            boolean r8 = r2.f11191t
            if (r8 == 0) goto L80
            int r8 = r13.rightMargin
            if (r8 == r7) goto L80
            r13.rightMargin = r7
            goto L81
        L80:
            r9 = r6
        L81:
            boolean r2 = r2.f11192u
            if (r2 == 0) goto L8e
            int r2 = r13.topMargin
            int r1 = r1.f36705b
            if (r2 == r1) goto L8e
            r13.topMargin = r1
            goto L90
        L8e:
            if (r9 == 0) goto L93
        L90:
            r11.setLayoutParams(r13)
        L93:
            int r13 = r11.getPaddingTop()
            r11.setPadding(r4, r13, r5, r3)
            boolean r11 = r10.f17735a
            if (r11 == 0) goto La6
            java.lang.Object r13 = r10.f17736b
            com.google.android.material.bottomsheet.BottomSheetBehavior r13 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r13
            int r0 = r0.f36707d
            r13.f11184m = r0
        La6:
            java.lang.Object r13 = r10.f17736b
            com.google.android.material.bottomsheet.BottomSheetBehavior r13 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r13
            boolean r0 = r13.f11186o
            if (r0 != 0) goto Lb0
            if (r11 == 0) goto Lb3
        Lb0:
            r13.K()
        Lb3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h.r0.g(android.view.View, d4.d3, v5.i):d4.d3");
    }

    public final synchronized void h(ak.e0 e0Var, boolean z10) {
        try {
            if (!this.f17735a && !z10) {
                this.f17735a = true;
                e0Var.b();
                this.f17735a = false;
            }
            ((Handler) this.f17736b).obtainMessage(1, e0Var).sendToTarget();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public /* synthetic */ r0(boolean z10, Serializable serializable) {
        this.f17735a = z10;
        this.f17736b = serializable;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(int i10) {
        this(e5.b.f15001a);
        if (i10 == 3) {
            return;
        }
        if (i10 != 4) {
            int i11 = 0;
            if (i10 == 6) {
                this.f17736b = new Handler(Looper.getMainLooper(), new ak.h0(i11));
            } else if (i10 != 8) {
                this.f17736b = new SparseBooleanArray();
            } else {
                this.f17735a = false;
            }
        }
    }
}
