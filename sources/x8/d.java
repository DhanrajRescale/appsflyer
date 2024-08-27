package x8;

import android.graphics.Bitmap;
import com.google.android.gms.common.api.Api;
import java.util.Date;
import kotlin.text.r;
import kotlin.text.s;
import okhttp3.Headers;
import okhttp3.Request;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Request f40098a;

    /* renamed from: b, reason: collision with root package name */
    public final b f40099b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f40100c;

    /* renamed from: d, reason: collision with root package name */
    public final String f40101d;

    /* renamed from: e, reason: collision with root package name */
    public final Date f40102e;

    /* renamed from: f, reason: collision with root package name */
    public final String f40103f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f40104g;

    /* renamed from: h, reason: collision with root package name */
    public final long f40105h;

    /* renamed from: i, reason: collision with root package name */
    public final long f40106i;

    /* renamed from: j, reason: collision with root package name */
    public final String f40107j;

    /* renamed from: k, reason: collision with root package name */
    public final int f40108k;

    public d(Request request, b bVar) {
        int i10;
        this.f40098a = request;
        this.f40099b = bVar;
        this.f40108k = -1;
        if (bVar != null) {
            this.f40105h = bVar.f40094c;
            this.f40106i = bVar.f40095d;
            Headers headers = bVar.f40097f;
            int size = headers.size();
            for (int i11 = 0; i11 < size; i11++) {
                String name = headers.name(i11);
                if (s.j(name, "Date", true)) {
                    this.f40100c = headers.getDate("Date");
                    this.f40101d = headers.value(i11);
                } else if (s.j(name, "Expires", true)) {
                    this.f40104g = headers.getDate("Expires");
                } else if (s.j(name, "Last-Modified", true)) {
                    this.f40102e = headers.getDate("Last-Modified");
                    this.f40103f = headers.value(i11);
                } else if (s.j(name, "ETag", true)) {
                    this.f40107j = headers.value(i11);
                } else if (s.j(name, "Age", true)) {
                    String value = headers.value(i11);
                    Bitmap.Config[] configArr = d9.e.f14221a;
                    Long h10 = r.h(value);
                    if (h10 != null) {
                        long longValue = h10.longValue();
                        if (longValue > 2147483647L) {
                            i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        } else if (longValue < 0) {
                            i10 = 0;
                        } else {
                            i10 = (int) longValue;
                        }
                    } else {
                        i10 = -1;
                    }
                    this.f40108k = i10;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d9, code lost:
    
        if (r7 > 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x8.e a() {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.d.a():x8.e");
    }
}
