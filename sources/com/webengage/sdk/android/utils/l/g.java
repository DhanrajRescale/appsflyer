package com.webengage.sdk.android.utils.l;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private int f12968a;

    /* renamed from: b, reason: collision with root package name */
    private Exception f12969b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<String>> f12970c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12971d;

    /* renamed from: e, reason: collision with root package name */
    private InputStream f12972e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f12973f;

    /* renamed from: g, reason: collision with root package name */
    private int f12974g;

    /* renamed from: h, reason: collision with root package name */
    private String f12975h;

    /* renamed from: i, reason: collision with root package name */
    private int f12976i;

    /* renamed from: j, reason: collision with root package name */
    private String f12977j;

    /* renamed from: k, reason: collision with root package name */
    private long f12978k;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f12979a = -1;

        /* renamed from: b, reason: collision with root package name */
        private Exception f12980b = null;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, List<String>> f12981c = null;

        /* renamed from: d, reason: collision with root package name */
        private boolean f12982d = true;

        /* renamed from: e, reason: collision with root package name */
        private InputStream f12983e = null;

        /* renamed from: f, reason: collision with root package name */
        private InputStream f12984f = null;

        /* renamed from: g, reason: collision with root package name */
        private int f12985g = -1;

        /* renamed from: h, reason: collision with root package name */
        private String f12986h = HttpUrl.FRAGMENT_ENCODE_SET;

        /* renamed from: i, reason: collision with root package name */
        private int f12987i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f12988j = null;

        /* renamed from: k, reason: collision with root package name */
        private long f12989k = 0;

        public b a(int i10) {
            this.f12987i = i10 | this.f12987i;
            return this;
        }

        public b b(int i10) {
            this.f12979a = i10;
            return this;
        }

        public b a(long j10) {
            this.f12989k = j10;
            return this;
        }

        public b b(InputStream inputStream) {
            this.f12983e = inputStream;
            return this;
        }

        public b c(int i10) {
            this.f12985g = i10;
            return this;
        }

        public b a(InputStream inputStream) {
            this.f12984f = inputStream;
            return this;
        }

        public b b(String str) {
            this.f12986h = str;
            return this;
        }

        public b a(Exception exc) {
            this.f12980b = exc;
            return this;
        }

        public b a(String str) {
            this.f12988j = str;
            return this;
        }

        public b a(Map<String, List<String>> map) {
            this.f12981c = map;
            return this;
        }

        public b a(boolean z10) {
            this.f12982d = z10;
            return this;
        }

        public g a() {
            return new g(this);
        }
    }

    private g(b bVar) {
        this.f12969b = bVar.f12980b;
        this.f12970c = bVar.f12981c;
        this.f12971d = bVar.f12982d;
        this.f12972e = bVar.f12983e;
        this.f12973f = bVar.f12984f;
        this.f12974g = bVar.f12985g;
        this.f12975h = bVar.f12986h;
        this.f12976i = bVar.f12987i;
        this.f12977j = bVar.f12988j;
        this.f12978k = bVar.f12989k;
        this.f12968a = bVar.f12979a;
    }

    public void a() {
        InputStream inputStream = this.f12973f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public void b() {
        InputStream inputStream = this.f12972e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public String c() {
        return this.f12977j;
    }

    public b d() {
        return new b().b(this.f12968a).a(this.f12969b).a(this.f12970c).a(this.f12971d).c(this.f12974g).b(this.f12972e).a(this.f12973f).b(this.f12975h).a(this.f12976i).a(this.f12977j).a(this.f12978k);
    }

    public InputStream e() {
        return this.f12973f;
    }

    public Exception f() {
        return this.f12969b;
    }

    public int g() {
        return this.f12976i;
    }

    public InputStream h() {
        return this.f12972e;
    }

    public int i() {
        return this.f12974g;
    }

    public Map<String, List<String>> j() {
        return this.f12970c;
    }

    public String k() {
        return this.f12975h;
    }

    public long l() {
        return this.f12978k;
    }

    public String m() {
        return this.f12977j;
    }

    public boolean n() {
        return this.f12969b == null && this.f12972e != null && this.f12973f == null;
    }

    public boolean o() {
        return this.f12971d;
    }
}
