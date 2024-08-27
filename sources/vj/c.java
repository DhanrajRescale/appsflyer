package vj;

import java.io.File;
import n5.b0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f38109a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f38110b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f38111c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f38112d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38113e;

    /* renamed from: f, reason: collision with root package name */
    public b0 f38114f;

    /* renamed from: g, reason: collision with root package name */
    public long f38115g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f38116h;

    public c(e eVar, String str) {
        this.f38116h = eVar;
        this.f38109a = str;
        int i10 = eVar.f38128g;
        this.f38110b = new long[i10];
        this.f38111c = new File[i10];
        this.f38112d = new File[i10];
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i11 = 0; i11 < eVar.f38128g; i11++) {
            sb2.append(i11);
            File[] fileArr = this.f38111c;
            String sb3 = sb2.toString();
            File file = eVar.f38122a;
            fileArr[i11] = new File(file, sb3);
            sb2.append(".tmp");
            this.f38112d[i11] = new File(file, sb2.toString());
            sb2.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        for (long j10 : this.f38110b) {
            sb2.append(' ');
            sb2.append(j10);
        }
        return sb2.toString();
    }
}
