package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import b5.b1;
import b5.n0;
import com.assetgro.stockgro.StockGroApplication;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.webengage.sdk.android.WebEngage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements jq.a, SuccessContinuation, b5.j, e5.j, o5.q, w.d0, z5.s, OnCompleteListener {
    public /* synthetic */ m(q0.g0 g0Var) {
    }

    @Override // z5.s
    public z5.p[] a() {
        return new z5.p[0];
    }

    @Override // w.d0
    public float b(float f10) {
        return f10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b5.m0, java.lang.Object] */
    @Override // b5.j
    public b5.k c(Bundle bundle) {
        Integer num;
        Bundle bundle2;
        Bundle bundle3;
        ?? obj = new Object();
        obj.f3437a = bundle.getCharSequence(n0.J);
        obj.f3438b = bundle.getCharSequence(n0.X);
        obj.f3439c = bundle.getCharSequence(n0.Y);
        obj.f3440d = bundle.getCharSequence(n0.Z);
        obj.f3441e = bundle.getCharSequence(n0.f3500e0);
        obj.f3442f = bundle.getCharSequence(n0.f3501f0);
        obj.f3443g = bundle.getCharSequence(n0.f3502g0);
        byte[] byteArray = bundle.getByteArray(n0.f3505j0);
        String str = n0.C0;
        byte[] bArr = null;
        if (bundle.containsKey(str)) {
            num = Integer.valueOf(bundle.getInt(str));
        } else {
            num = null;
        }
        if (byteArray != null) {
            bArr = (byte[]) byteArray.clone();
        }
        obj.f3446j = bArr;
        obj.f3447k = num;
        obj.f3448l = (Uri) bundle.getParcelable(n0.f3506k0);
        obj.f3460x = bundle.getCharSequence(n0.f3516v0);
        obj.f3461y = bundle.getCharSequence(n0.f3517w0);
        obj.f3462z = bundle.getCharSequence(n0.f3518x0);
        obj.C = bundle.getCharSequence(n0.A0);
        obj.D = bundle.getCharSequence(n0.B0);
        obj.E = bundle.getCharSequence(n0.D0);
        obj.G = bundle.getBundle(n0.G0);
        String str2 = n0.f3503h0;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            obj.f3444h = (b1) b1.f3225b.c(bundle3);
        }
        String str3 = n0.f3504i0;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            obj.f3445i = (b1) b1.f3225b.c(bundle2);
        }
        String str4 = n0.f3507l0;
        if (bundle.containsKey(str4)) {
            obj.f3449m = Integer.valueOf(bundle.getInt(str4));
        }
        String str5 = n0.f3508m0;
        if (bundle.containsKey(str5)) {
            obj.f3450n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = n0.n0;
        if (bundle.containsKey(str6)) {
            obj.f3451o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = n0.F0;
        if (bundle.containsKey(str7)) {
            obj.f3452p = Boolean.valueOf(bundle.getBoolean(str7));
        }
        String str8 = n0.f3509o0;
        if (bundle.containsKey(str8)) {
            obj.f3453q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = n0.f3510p0;
        if (bundle.containsKey(str9)) {
            obj.f3454r = Integer.valueOf(bundle.getInt(str9));
        }
        String str10 = n0.f3511q0;
        if (bundle.containsKey(str10)) {
            obj.f3455s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = n0.f3512r0;
        if (bundle.containsKey(str11)) {
            obj.f3456t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = n0.f3513s0;
        if (bundle.containsKey(str12)) {
            obj.f3457u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = n0.f3514t0;
        if (bundle.containsKey(str13)) {
            obj.f3458v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = n0.f3515u0;
        if (bundle.containsKey(str14)) {
            obj.f3459w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = n0.f3519y0;
        if (bundle.containsKey(str15)) {
            obj.A = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = n0.f3520z0;
        if (bundle.containsKey(str16)) {
            obj.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = n0.E0;
        if (bundle.containsKey(str17)) {
            obj.F = Integer.valueOf(bundle.getInt(str17));
        }
        return new n0(obj);
    }

    @Override // e5.j
    public void invoke(Object obj) {
        ((j5.c) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        StockGroApplication stockGroApplication = StockGroApplication.f8559c;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            WebEngage.get().setRegistrationID((String) task.getResult());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // o5.q
    public List p(String str, boolean z10, boolean z11) {
        return o5.u.e(str, z10, z11);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
