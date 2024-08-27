package k7;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public int f22586a;

    /* renamed from: b, reason: collision with root package name */
    public int f22587b;

    /* renamed from: c, reason: collision with root package name */
    public int f22588c;

    /* renamed from: d, reason: collision with root package name */
    public int f22589d;

    /* renamed from: e, reason: collision with root package name */
    public int f22590e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22591f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22592g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22593h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22594i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22595j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22596k;

    /* renamed from: l, reason: collision with root package name */
    public int f22597l;

    /* renamed from: m, reason: collision with root package name */
    public long f22598m;

    /* renamed from: n, reason: collision with root package name */
    public int f22599n;

    public final void a(int i10) {
        if ((this.f22589d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f22589d));
    }

    public final int b() {
        return this.f22592g ? this.f22587b - this.f22588c : this.f22590e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
        sb2.append(this.f22586a);
        sb2.append(", mData=null, mItemCount=");
        sb2.append(this.f22590e);
        sb2.append(", mIsMeasuring=");
        sb2.append(this.f22594i);
        sb2.append(", mPreviousLayoutItemCount=");
        sb2.append(this.f22587b);
        sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb2.append(this.f22588c);
        sb2.append(", mStructureChanged=");
        sb2.append(this.f22591f);
        sb2.append(", mInPreLayout=");
        sb2.append(this.f22592g);
        sb2.append(", mRunSimpleAnimations=");
        sb2.append(this.f22595j);
        sb2.append(", mRunPredictiveAnimations=");
        return v.e.k(sb2, this.f22596k, UrlTreeKt.componentParamSuffixChar);
    }
}
