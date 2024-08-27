package k7;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class y1 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f22628t = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f22629a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f22630b;

    /* renamed from: j, reason: collision with root package name */
    public int f22638j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f22646r;

    /* renamed from: s, reason: collision with root package name */
    public z0 f22647s;

    /* renamed from: c, reason: collision with root package name */
    public int f22631c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f22632d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f22633e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f22634f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f22635g = -1;

    /* renamed from: h, reason: collision with root package name */
    public y1 f22636h = null;

    /* renamed from: i, reason: collision with root package name */
    public y1 f22637i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f22639k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f22640l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f22641m = 0;

    /* renamed from: n, reason: collision with root package name */
    public u6.g f22642n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22643o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f22644p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f22645q = -1;

    public y1(View view) {
        if (view != null) {
            this.f22629a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(UserMetadata.MAX_ATTRIBUTE_SIZE);
            return;
        }
        if ((1024 & this.f22638j) == 0) {
            if (this.f22639k == null) {
                ArrayList arrayList = new ArrayList();
                this.f22639k = arrayList;
                this.f22640l = Collections.unmodifiableList(arrayList);
            }
            this.f22639k.add(obj);
        }
    }

    public final void b(int i10) {
        this.f22638j = i10 | this.f22638j;
    }

    public final int c() {
        RecyclerView recyclerView = this.f22646r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.K(this);
    }

    public final int d() {
        RecyclerView recyclerView;
        z0 adapter;
        int K;
        if (this.f22647s == null || (recyclerView = this.f22646r) == null || (adapter = recyclerView.getAdapter()) == null || (K = this.f22646r.K(this)) == -1 || this.f22647s != adapter) {
            return -1;
        }
        return K;
    }

    public final int e() {
        int i10 = this.f22635g;
        return i10 == -1 ? this.f22631c : i10;
    }

    public final List f() {
        ArrayList arrayList;
        int i10 = this.f22638j & UserMetadata.MAX_ATTRIBUTE_SIZE;
        List list = f22628t;
        if (i10 == 0 && (arrayList = this.f22639k) != null && arrayList.size() != 0) {
            return this.f22640l;
        }
        return list;
    }

    public final boolean g(int i10) {
        return (i10 & this.f22638j) != 0;
    }

    public final boolean h() {
        View view = this.f22629a;
        if (view.getParent() != null && view.getParent() != this.f22646r) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        return (this.f22638j & 1) != 0;
    }

    public final boolean j() {
        return (this.f22638j & 4) != 0;
    }

    public final boolean k() {
        if ((this.f22638j & 16) == 0) {
            WeakHashMap weakHashMap = d4.n1.f13788a;
            if (!d4.v0.i(this.f22629a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        return (this.f22638j & 8) != 0;
    }

    public final boolean m() {
        return this.f22642n != null;
    }

    public final boolean n() {
        return (this.f22638j & 256) != 0;
    }

    public final boolean o() {
        return (this.f22638j & 2) != 0;
    }

    public final void p(int i10, boolean z10) {
        if (this.f22632d == -1) {
            this.f22632d = this.f22631c;
        }
        if (this.f22635g == -1) {
            this.f22635g = this.f22631c;
        }
        if (z10) {
            this.f22635g += i10;
        }
        this.f22631c += i10;
        View view = this.f22629a;
        if (view.getLayoutParams() != null) {
            ((j1) view.getLayoutParams()).f22432c = true;
        }
    }

    public final void q() {
        if (RecyclerView.U0 && n()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f22638j = 0;
        this.f22631c = -1;
        this.f22632d = -1;
        this.f22633e = -1L;
        this.f22635g = -1;
        this.f22641m = 0;
        this.f22636h = null;
        this.f22637i = null;
        ArrayList arrayList = this.f22639k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f22638j &= -1025;
        this.f22644p = 0;
        this.f22645q = -1;
        RecyclerView.l(this);
    }

    public final void r(boolean z10) {
        int i10;
        int i11 = this.f22641m;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f22641m = i10;
        if (i10 < 0) {
            this.f22641m = 0;
            if (!RecyclerView.U0) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z10 && i10 == 1) {
            this.f22638j |= 16;
        } else if (z10 && i10 == 0) {
            this.f22638j &= -17;
        }
        if (RecyclerView.V0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
        }
    }

    public final boolean s() {
        return (this.f22638j & 128) != 0;
    }

    public final boolean t() {
        return (this.f22638j & 32) != 0;
    }

    public final String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder r10 = da.e.r(simpleName, UrlTreeKt.componentParamPrefix);
        r10.append(Integer.toHexString(hashCode()));
        r10.append(" position=");
        r10.append(this.f22631c);
        r10.append(" id=");
        r10.append(this.f22633e);
        r10.append(", oldPos=");
        r10.append(this.f22632d);
        r10.append(", pLpos:");
        r10.append(this.f22635g);
        StringBuilder sb2 = new StringBuilder(r10.toString());
        if (m()) {
            sb2.append(" scrap ");
            if (this.f22643o) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb2.append(str);
        }
        if (j()) {
            sb2.append(" invalid");
        }
        if (!i()) {
            sb2.append(" unbound");
        }
        if ((this.f22638j & 2) != 0) {
            sb2.append(" update");
        }
        if (l()) {
            sb2.append(" removed");
        }
        if (s()) {
            sb2.append(" ignored");
        }
        if (n()) {
            sb2.append(" tmpDetached");
        }
        if (!k()) {
            sb2.append(" not recyclable(" + this.f22641m + ")");
        }
        if ((this.f22638j & 512) != 0 || j()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f22629a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append(UrlTreeKt.componentParamSuffix);
        return sb2.toString();
    }
}
