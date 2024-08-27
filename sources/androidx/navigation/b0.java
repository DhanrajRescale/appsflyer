package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f2154a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f2155b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2156c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2157d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2158e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2159f;

    public b0(c0 destination, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f2154a = destination;
        this.f2155b = bundle;
        this.f2156c = z10;
        this.f2157d = i10;
        this.f2158e = z11;
        this.f2159f = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z10 = this.f2156c;
        if (z10 && !other.f2156c) {
            return 1;
        }
        if (!z10 && other.f2156c) {
            return -1;
        }
        int i10 = this.f2157d - other.f2157d;
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        Bundle bundle = other.f2155b;
        Bundle bundle2 = this.f2155b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            Intrinsics.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z11 = other.f2158e;
        boolean z12 = this.f2158e;
        if (z12 && !z11) {
            return 1;
        }
        if (!z12 && z11) {
            return -1;
        }
        return this.f2159f - other.f2159f;
    }
}
