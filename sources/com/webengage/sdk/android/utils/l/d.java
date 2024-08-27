package com.webengage.sdk.android.utils.l;

import android.content.Context;
import android.net.TrafficStats;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import com.webengage.sdk.android.utils.l.g;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public class d extends com.webengage.sdk.android.utils.l.a {

    /* renamed from: d, reason: collision with root package name */
    String f12936d;

    /* renamed from: e, reason: collision with root package name */
    g f12937e;

    /* renamed from: f, reason: collision with root package name */
    private Context f12938f;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12939a;

        static {
            int[] iArr = new int[b.values().length];
            f12939a = iArr;
            try {
                iArr[b.MAX_AGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12939a[b.LAST_MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12939a[b.ETAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12939a[b.EXPIRES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12939a[b.CACHE_CONTROL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        MAX_AGE,
        LAST_MODIFIED,
        ETAG,
        EXPIRES,
        CACHE_CONTROL
    }

    public d(Context context, f fVar) {
        super(context, fVar);
        this.f12936d = null;
        this.f12937e = null;
        this.f12938f = null;
        this.f12936d = a(fVar.i());
        this.f12938f = context;
    }

    private g h() {
        OutputStream outputStream;
        g.b bVar = new g.b();
        bVar.b(this.f12933c.h());
        bVar.a(this.f12933c.d());
        TrafficStats.setThreadStatsTag(WebEngageConstant.f12690a);
        bVar.a(this.f12936d);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f12933c.i()).openConnection()));
            httpURLConnection.setRequestMethod(this.f12933c.g().toString());
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(20000);
            if (this.f12933c.e() != null) {
                for (Map.Entry<String, String> entry : this.f12933c.e().entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            }
            e eVar = e.GET;
            if (!eVar.toString().equalsIgnoreCase(this.f12933c.g().toString())) {
                httpURLConnection.setDoOutput(true);
            }
            httpURLConnection.setDoInput(true);
            Object f10 = this.f12933c.f();
            if (f10 != null) {
                if (this.f12933c.e() != null && this.f12933c.e().containsKey("Content-Encoding") && "gzip".equalsIgnoreCase(this.f12933c.e().get("Content-Encoding"))) {
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    outputStream = httpURLConnection.getOutputStream();
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                    a(new OutputStreamWriter(gZIPOutputStream), f10);
                    gZIPOutputStream.close();
                } else {
                    outputStream = httpURLConnection.getOutputStream();
                    a(new OutputStreamWriter(outputStream), f10);
                }
                outputStream.close();
            }
            bVar.c(httpURLConnection.getResponseCode());
            if (httpURLConnection.getResponseCode() == 304 && eVar.equals(this.f12933c.g())) {
                bVar.a(false);
            }
            HashMap hashMap = new HashMap();
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(entry2.getValue());
                    if (entry2.getKey() != null) {
                        hashMap.put(entry2.getKey().toLowerCase(), arrayList);
                    }
                }
            }
            bVar.a(hashMap);
            g a10 = bVar.a();
            if (a10.i() != 200) {
                if (a10.i() < 400) {
                    return a10;
                }
                try {
                    return a10.d().a(httpURLConnection.getErrorStream()).a();
                } catch (Exception unused) {
                    return a10;
                }
            }
            g a11 = a10.d().b(WebEngageUtils.a(httpURLConnection) ? new GZIPInputStream(httpURLConnection.getInputStream()) : httpURLConnection.getInputStream()).a();
            List<c> list = com.webengage.sdk.android.utils.l.a.f12931a;
            synchronized (list) {
                try {
                    Iterator<c> it = list.iterator();
                    while (it.hasNext()) {
                        a11 = it.next().a(a11, this.f12938f);
                    }
                } finally {
                }
            }
            g a12 = a11.d().a(System.currentTimeMillis()).a();
            if (this.f12933c.b() == 3 || !a12.n()) {
                return a12;
            }
            return a12.d().b(new ByteArrayInputStream(b(a12))).a();
        } catch (Exception e10) {
            bVar.a(e10);
            return bVar.a();
        }
    }

    @Override // com.webengage.sdk.android.utils.l.a
    public g a(g gVar) {
        if (this.f12937e == null) {
            this.f12937e = com.webengage.sdk.android.utils.l.b.b(this.f12938f).b(this.f12936d);
        }
        if (gVar != null) {
            this.f12937e = this.f12937e.d().c(gVar.i()).a();
        }
        return this.f12937e.d().b(this.f12933c.h()).a(this.f12933c.d()).a();
    }

    public byte[] b(g gVar) {
        return com.webengage.sdk.android.utils.l.b.b(this.f12938f).a(gVar);
    }

    @Override // com.webengage.sdk.android.utils.l.a
    public g c() {
        return h();
    }

    @Override // com.webengage.sdk.android.utils.l.a
    public g d() {
        return this.f12937e;
    }

    @Override // com.webengage.sdk.android.utils.l.a
    public boolean e() {
        return false;
    }

    @Override // com.webengage.sdk.android.utils.l.a
    public boolean f() {
        g b10 = com.webengage.sdk.android.utils.l.b.b(this.f12938f).b(this.f12936d);
        this.f12937e = b10;
        return b10.n();
    }

    @Override // com.webengage.sdk.android.utils.l.a
    public g g() {
        if (this.f12937e == null) {
            this.f12937e = com.webengage.sdk.android.utils.l.b.b(this.f12938f).b(this.f12936d);
        }
        String a10 = a(this.f12937e.j(), b.ETAG);
        String a11 = a(this.f12937e.j(), b.LAST_MODIFIED);
        if (a10 == null && a11 == null) {
            return h();
        }
        Map<String, String> e10 = this.f12933c.e();
        if (e10 == null) {
            e10 = new HashMap<>();
        }
        if (a10 != null) {
            e10.put("If-None-Match", a10);
        } else {
            e10.put("If-Modified-Since", a11);
        }
        this.f12933c = this.f12933c.c().a(e10).a();
        return h();
    }

    private String a(String str) {
        return str;
    }

    private String a(Map<String, List<String>> map, b bVar) {
        String str;
        List<String> list;
        int i10 = a.f12939a[bVar.ordinal()];
        if (i10 == 1) {
            if (map.get("cache-control") == null) {
                return null;
            }
            String str2 = map.get("cache-control").get(0);
            if (!str2.contains("max-age")) {
                return null;
            }
            int indexOf = str2.indexOf(",");
            int indexOf2 = str2.indexOf("max-age") + 8;
            if (indexOf == -1) {
                indexOf = str2.length();
            }
            return str2.substring(indexOf2, indexOf);
        }
        if (i10 == 2) {
            str = "last-modified";
            if (map.get("last-modified") == null) {
                return null;
            }
        } else if (i10 == 3) {
            str = "etag";
            if (map.get("etag") == null) {
                return null;
            }
        } else {
            if (i10 != 4) {
                if (i10 != 5 || map.get("cache-control") == null) {
                    return null;
                }
                list = map.get("cache-control");
                return list.get(0);
            }
            str = "expires";
            if (map.get("expires") == null) {
                return null;
            }
        }
        list = map.get(str);
        return list.get(0);
    }

    private void a(Writer writer, Object obj) {
        writer.write(obj instanceof Map ? WebEngageUtils.b((Map<String, String>) obj) : obj.toString());
        writer.close();
    }
}
