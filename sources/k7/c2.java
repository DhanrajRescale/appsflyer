package k7;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f22313a;

    /* renamed from: b, reason: collision with root package name */
    public int f22314b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22315c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22316d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22317e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f22318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f22319g;

    public c2(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f22319g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f22313a = -1;
        this.f22314b = Integer.MIN_VALUE;
        this.f22315c = false;
        this.f22316d = false;
        this.f22317e = false;
        int[] iArr = this.f22318f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
