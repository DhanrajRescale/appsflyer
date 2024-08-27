package hf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18375a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18376b;

    /* renamed from: c, reason: collision with root package name */
    public final List f18377c;

    /* renamed from: d, reason: collision with root package name */
    public final List f18378d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18379e;

    public j(boolean z10, boolean z11, List listOfWidgets, List listOfWidgetsV2, boolean z12) {
        Intrinsics.checkNotNullParameter(listOfWidgets, "listOfWidgets");
        Intrinsics.checkNotNullParameter(listOfWidgetsV2, "listOfWidgetsV2");
        this.f18375a = z10;
        this.f18376b = z11;
        this.f18377c = listOfWidgets;
        this.f18378d = listOfWidgetsV2;
        this.f18379e = z12;
    }

    public static j a(j jVar, boolean z10, boolean z11, List list, List list2, boolean z12, int i10) {
        if ((i10 & 1) != 0) {
            z10 = jVar.f18375a;
        }
        boolean z13 = z10;
        if ((i10 & 2) != 0) {
            z11 = jVar.f18376b;
        }
        boolean z14 = z11;
        if ((i10 & 4) != 0) {
            list = jVar.f18377c;
        }
        List listOfWidgets = list;
        if ((i10 & 8) != 0) {
            list2 = jVar.f18378d;
        }
        List listOfWidgetsV2 = list2;
        if ((i10 & 16) != 0) {
            z12 = jVar.f18379e;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(listOfWidgets, "listOfWidgets");
        Intrinsics.checkNotNullParameter(listOfWidgetsV2, "listOfWidgetsV2");
        return new j(z13, z14, listOfWidgets, listOfWidgetsV2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f18375a == jVar.f18375a && this.f18376b == jVar.f18376b && Intrinsics.a(this.f18377c, jVar.f18377c) && Intrinsics.a(this.f18378d, jVar.f18378d) && this.f18379e == jVar.f18379e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18379e) + nn.d.e(this.f18378d, nn.d.e(this.f18377c, v.e.d(this.f18376b, Boolean.hashCode(this.f18375a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HomePageUiState(showShimmer=");
        sb2.append(this.f18375a);
        sb2.append(", scrollToTop=");
        sb2.append(this.f18376b);
        sb2.append(", listOfWidgets=");
        sb2.append(this.f18377c);
        sb2.append(", listOfWidgetsV2=");
        sb2.append(this.f18378d);
        sb2.append(", triggerRetry=");
        return da.e.o(sb2, this.f18379e, ")");
    }

    public /* synthetic */ j() {
        this(false, false, new ArrayList(), new ArrayList(), false);
    }
}
