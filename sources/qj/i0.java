package qj;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.ui.chat.helper.search.SearchContactViewModel;
import k7.n1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class i0 extends n1 {

    /* renamed from: a, reason: collision with root package name */
    public ge.n f32013a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32014b;

    /* renamed from: c, reason: collision with root package name */
    public int f32015c;

    /* renamed from: d, reason: collision with root package name */
    public LinearLayoutManager f32016d;

    @Override // k7.n1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i11 <= 0) {
            return;
        }
        LinearLayoutManager linearLayoutManager = this.f32016d;
        this.f32015c = linearLayoutManager.B();
        int R0 = linearLayoutManager.R0();
        if (!this.f32014b && this.f32015c <= R0 + 10) {
            ge.n nVar = this.f32013a;
            if (nVar != null) {
                ge.o oVar = nVar.f17325a;
                if (((SearchContactViewModel) oVar.r()).B) {
                    ((SearchContactViewModel) oVar.r()).C++;
                    ((SearchContactViewModel) oVar.r()).i(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                this.f32014b = true;
                return;
            }
            Intrinsics.k("mOnLoadMoreListener");
            throw null;
        }
    }
}
