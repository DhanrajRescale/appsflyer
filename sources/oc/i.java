package oc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.pa;
import ba.ra;
import ba.ta;
import com.assetgro.stockgro.prod.R;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import k7.y1;
import k7.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends z0 {

    /* renamed from: g, reason: collision with root package name */
    public Context f29947g;

    /* renamed from: i, reason: collision with root package name */
    public d f29949i;

    /* renamed from: j, reason: collision with root package name */
    public c f29950j;

    /* renamed from: k, reason: collision with root package name */
    public e f29951k;

    /* renamed from: d, reason: collision with root package name */
    public final int f29944d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final int f29945e = 2;

    /* renamed from: f, reason: collision with root package name */
    public String f29946f = "ongoing";

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f29948h = new ArrayList();

    @Override // k7.z0
    public final int a() {
        return this.f29948h.size();
    }

    @Override // k7.z0
    public final int c(int i10) {
        String str = this.f29946f;
        int hashCode = str.hashCode();
        int i11 = this.f29945e;
        if (hashCode != -1318566021) {
            if (hashCode != -1273775369) {
                if (hashCode == -1263170109 && str.equals("future")) {
                    return this.f29944d;
                }
                return i11;
            }
            str.equals("previous");
            return i11;
        }
        if (str.equals("ongoing")) {
            return 0;
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0112, code lost:
    
        if (r0.equals("X") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0135, code lost:
    
        r0 = r12.f29942u.f6173s;
        r1 = r11.f29947g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013b, code lost:
    
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013d, code lost:
    
        r0.setBackgroundColor(r3.k.getColor(r1, com.assetgro.stockgro.prod.R.color.stream_gray));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0148, code lost:
    
        kotlin.jvm.internal.Intrinsics.k(in.juspay.hyper.constants.LogCategory.CONTEXT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0132, code lost:
    
        if (r0.equals("FL") == false) goto L82;
     */
    @Override // k7.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(k7.y1 r12, int r13) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.i.h(k7.y1, int):void");
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f29947g = context;
        if (i10 == 0) {
            if (context != null) {
                LayoutInflater from = LayoutInflater.from(context);
                int i11 = pa.G;
                DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
                pa paVar = (pa) m4.m.g(from, R.layout.cell_my_league_v2, parent, false, null);
                Intrinsics.checkNotNullExpressionValue(paVar, "inflate(...)");
                return new f(paVar);
            }
            Intrinsics.k(LogCategory.CONTEXT);
            throw null;
        }
        if (i10 == this.f29944d) {
            if (context != null) {
                LayoutInflater from2 = LayoutInflater.from(context);
                int i12 = ra.D;
                DataBinderMapperImpl dataBinderMapperImpl2 = m4.d.f27474a;
                ra raVar = (ra) m4.m.g(from2, R.layout.cell_my_league_v2_coming_soon, parent, false, null);
                Intrinsics.checkNotNullExpressionValue(raVar, "inflate(...)");
                return new h(raVar);
            }
            Intrinsics.k(LogCategory.CONTEXT);
            throw null;
        }
        if (i10 == this.f29945e) {
            if (context != null) {
                LayoutInflater from3 = LayoutInflater.from(context);
                int i13 = ta.I;
                DataBinderMapperImpl dataBinderMapperImpl3 = m4.d.f27474a;
                ta taVar = (ta) m4.m.g(from3, R.layout.cell_my_league_v2_completed, parent, false, null);
                Intrinsics.checkNotNullExpressionValue(taVar, "inflate(...)");
                return new g(taVar);
            }
            Intrinsics.k(LogCategory.CONTEXT);
            throw null;
        }
        View v10 = new View(parent.getContext());
        Intrinsics.checkNotNullParameter(v10, "v");
        return new y1(v10);
    }
}
