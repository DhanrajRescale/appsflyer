package u5;

import aq.d0;
import com.firebase.ui.auth.data.remote.GenericIdpAnonymousUpgradeLinkingHandler;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ek.h0;
import java.util.Arrays;
import java.util.HashMap;
import lp.j1;
import lp.l0;
import lp.o0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements m, OnSuccessListener, SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f36765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36767c;

    public /* synthetic */ d(Object obj, boolean z10, Object obj2) {
        this.f36766b = obj;
        this.f36765a = z10;
        this.f36767c = obj2;
    }

    @Override // u5.m
    public final j1 d(int i10, b5.j1 j1Var, int[] iArr) {
        p pVar = (p) this.f36766b;
        i iVar = (i) this.f36767c;
        boolean z10 = this.f36765a;
        pVar.getClass();
        e eVar = new e(pVar);
        l0 l0Var = o0.f25025b;
        kp.j.A(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i11 = 0;
        boolean z11 = false;
        for (int i12 = 0; i12 < j1Var.f3376a; i12++) {
            int i13 = i11;
            f fVar = new f(i10, j1Var, i12, iVar, iArr[i12], z10, eVar);
            int i14 = i13 + 1;
            if (objArr.length < i14) {
                objArr = Arrays.copyOf(objArr, bl.j.z(objArr.length, i14));
            } else if (z11) {
                objArr = (Object[]) objArr.clone();
            } else {
                i11 = i13 + 1;
                objArr[i13] = fVar;
            }
            z11 = false;
            i11 = i13 + 1;
            objArr[i13] = fVar;
        }
        return o0.o(i11, objArr);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        GenericIdpAnonymousUpgradeLinkingHandler genericIdpAnonymousUpgradeLinkingHandler = (GenericIdpAnonymousUpgradeLinkingHandler) this.f36766b;
        boolean z10 = this.f36765a;
        h0 h0Var = (h0) this.f36767c;
        genericIdpAnonymousUpgradeLinkingHandler.getClass();
        d0 d0Var = (d0) ((zp.e) obj);
        genericIdpAnonymousUpgradeLinkingHandler.l(z10, h0Var.j(), d0Var.f2698a, d0Var.f2700c, true);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        jr.d dVar = (jr.d) this.f36766b;
        boolean z10 = this.f36765a;
        jr.e eVar = (jr.e) this.f36767c;
        HashMap hashMap = jr.d.f21585d;
        if (z10) {
            synchronized (dVar) {
                dVar.f21589c = Tasks.forResult(eVar);
            }
        } else {
            dVar.getClass();
        }
        return Tasks.forResult(eVar);
    }

    public /* synthetic */ d(p pVar, i iVar, boolean z10) {
        this.f36766b = pVar;
        this.f36767c = iVar;
        this.f36765a = z10;
    }
}
