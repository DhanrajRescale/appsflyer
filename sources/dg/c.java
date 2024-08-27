package dg;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import ba.i5;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldg/c;", "Lao/g;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends ao.g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f14335i = 0;

    /* renamed from: b, reason: collision with root package name */
    public d f14336b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14337c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14338d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f14339e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f14340f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ut.g f14341g = ut.h.a(new ag.b(this, 2));

    /* renamed from: h, reason: collision with root package name */
    public i5 f14342h;

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i10 = i5.f5012y;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        i5 i5Var = (i5) m4.m.g(inflater, R.layout.bottom_sheet_advance_transaction_filter, viewGroup, false, null);
        Intrinsics.checkNotNullExpressionValue(i5Var, "inflate(...)");
        Intrinsics.checkNotNullParameter(i5Var, "<set-?>");
        this.f14342h = i5Var;
        View view = r().f27491e;
        Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x003f, code lost:
    
        if ((r11 instanceof dg.d) != false) goto L17;
     */
    @Override // androidx.fragment.app.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dg.c.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final i5 r() {
        i5 i5Var = this.f14342h;
        if (i5Var != null) {
            return i5Var;
        }
        Intrinsics.k("binding");
        throw null;
    }
}
