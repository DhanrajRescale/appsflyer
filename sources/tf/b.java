package tf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import ba.b6;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltf/b;", "Lao/g;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends ao.g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f36008c = 0;

    /* renamed from: b, reason: collision with root package name */
    public b6 f36009b;

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i10 = b6.f4257v;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        b6 b6Var = (b6) m.g(inflater, R.layout.bottom_sheet_message, viewGroup, false, null);
        Intrinsics.checkNotNullExpressionValue(b6Var, "inflate(...)");
        Intrinsics.checkNotNullParameter(b6Var, "<set-?>");
        this.f36009b = b6Var;
        if (b6Var != null) {
            View view = b6Var.f27491e;
            Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
            return view;
        }
        Intrinsics.k("binding");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0030, code lost:
    
        if ((r6 instanceof com.assetgro.stockgro.data.model.portfolio.WithdrawPreCheckData) != false) goto L14;
     */
    @Override // androidx.fragment.app.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            super.onViewCreated(r6, r7)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            r0 = 0
            if (r6 < r7) goto L1e
            android.os.Bundle r6 = r5.getArguments()
            if (r6 == 0) goto L1c
            java.lang.Object r6 = k2.m.h(r6)
            com.assetgro.stockgro.data.model.portfolio.WithdrawPreCheckData r6 = (com.assetgro.stockgro.data.model.portfolio.WithdrawPreCheckData) r6
            goto L32
        L1c:
            r6 = r0
            goto L32
        L1e:
            android.os.Bundle r6 = r5.getArguments()
            if (r6 == 0) goto L2d
            java.lang.String r7 = "DATA"
            android.os.Parcelable r6 = r6.getParcelable(r7)
            com.assetgro.stockgro.data.model.portfolio.WithdrawPreCheckData r6 = (com.assetgro.stockgro.data.model.portfolio.WithdrawPreCheckData) r6
            goto L2e
        L2d:
            r6 = r0
        L2e:
            boolean r7 = r6 instanceof com.assetgro.stockgro.data.model.portfolio.WithdrawPreCheckData
            if (r7 == 0) goto L1c
        L32:
            if (r6 == 0) goto L6c
            ba.b6 r7 = r5.f36009b
            if (r7 == 0) goto L66
            ba.c6 r7 = (ba.c6) r7
            r7.f4260u = r6
            monitor-enter(r7)
            long r1 = r7.f4340w     // Catch: java.lang.Throwable -> L63
            r3 = 1
            long r1 = r1 | r3
            r7.f4340w = r1     // Catch: java.lang.Throwable -> L63
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L63
            r1 = 6
            r7.a(r1)
            r7.m()
            ba.b6 r7 = r5.f36009b
            if (r7 == 0) goto L5d
            com.google.android.material.button.MaterialButton r7 = r7.f4258s
            bb.a r0 = new bb.a
            r1 = 12
            r0.<init>(r1, r5, r6)
            r7.setOnClickListener(r0)
            return
        L5d:
            java.lang.String r6 = "binding"
            kotlin.jvm.internal.Intrinsics.k(r6)
            throw r0
        L63:
            r6 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L63
            throw r6
        L66:
            java.lang.String r6 = "binding"
            kotlin.jvm.internal.Intrinsics.k(r6)
            throw r0
        L6c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Required preCheckData not supplied"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.b.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
