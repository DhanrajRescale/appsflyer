package ae;

import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f384h;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f385i;

    /* renamed from: j, reason: collision with root package name */
    public final Function1 f386j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [k7.w, java.lang.Object] */
    public f(o parentLifecycle, d onLongPress, d onUserInfoClicked, d onDownloadClicked) {
        super(parentLifecycle, new Object());
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(onLongPress, "onLongPress");
        Intrinsics.checkNotNullParameter(onUserInfoClicked, "onUserInfoClicked");
        Intrinsics.checkNotNullParameter(onDownloadClicked, "onDownloadClicked");
        this.f384h = onLongPress;
        this.f385i = onUserInfoClicked;
        this.f386j = onDownloadClicked;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new j(parent, this.f384h, this.f385i, this.f386j);
    }
}
