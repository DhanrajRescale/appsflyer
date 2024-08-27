package hl;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f18603a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18604b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18605c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18606d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f18607e;

    /* renamed from: f, reason: collision with root package name */
    public File f18608f;

    /* renamed from: g, reason: collision with root package name */
    public b f18609g;

    /* renamed from: h, reason: collision with root package name */
    public Runnable f18610h;

    public d(String useCase, String assetUri, String str, int i10, float[] fArr) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(assetUri, "assetUri");
        this.f18603a = useCase;
        this.f18604b = assetUri;
        this.f18605c = str;
        this.f18606d = i10;
        this.f18607e = fArr;
    }
}
