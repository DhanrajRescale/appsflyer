package dv;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public BufferedReader f14544a;

    /* renamed from: b, reason: collision with root package name */
    public char[] f14545b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f14546c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f14547d;

    /* renamed from: e, reason: collision with root package name */
    public transient StringBuffer f14548e;

    /* renamed from: f, reason: collision with root package name */
    public transient boolean f14549f;

    /* renamed from: g, reason: collision with root package name */
    public transient u f14550g;

    /* renamed from: h, reason: collision with root package name */
    public transient ArrayList f14551h;

    /* renamed from: i, reason: collision with root package name */
    public transient HashSet f14552i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14553j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14554k;

    /* renamed from: l, reason: collision with root package name */
    public String f14555l;

    /* renamed from: m, reason: collision with root package name */
    public k f14556m;

    /* renamed from: n, reason: collision with root package name */
    public e f14557n;

    /* renamed from: o, reason: collision with root package name */
    public wn.e f14558o;

    /* renamed from: p, reason: collision with root package name */
    public d f14559p;

    public final boolean a() {
        StringBuffer stringBuffer = this.f14548e;
        if (stringBuffer.length() <= 0) {
            return false;
        }
        this.f14557n.getClass();
        b(new g(stringBuffer.toString()));
        stringBuffer.delete(0, stringBuffer.length());
        return true;
    }

    public final void b(a aVar) {
        aVar.getClass();
        ArrayList arrayList = this.f14551h;
        arrayList.add(aVar);
        this.f14556m.i(arrayList, arrayList.listIterator(arrayList.size() - 1), this.f14559p);
    }

    public final String c() {
        boolean z10;
        q();
        if (!k(UrlTreeKt.configurablePathSegmentPrefixChar, this.f14546c) && !k(UrlTreeKt.configurablePathSegmentSuffixChar, this.f14546c) && !r("/>")) {
            StringBuffer stringBuffer = new StringBuffer();
            boolean z11 = false;
            if (k('\'', this.f14546c)) {
                p();
                g(1);
                z10 = false;
                z11 = true;
            } else if (k('\"', this.f14546c)) {
                p();
                g(1);
                z10 = true;
            } else {
                z10 = false;
            }
            e eVar = this.f14557n;
            boolean z12 = eVar.f14520c;
            eVar.getClass();
            while (!j() && ((z11 && !k('\'', this.f14546c) && !k(UrlTreeKt.configurablePathSegmentSuffixChar, this.f14546c) && !k(UrlTreeKt.configurablePathSegmentPrefixChar, this.f14546c) && (z12 || !n(this.f14546c))) || ((z10 && !k('\"', this.f14546c) && !k(UrlTreeKt.configurablePathSegmentSuffixChar, this.f14546c) && !k(UrlTreeKt.configurablePathSegmentPrefixChar, this.f14546c) && (z12 || !n(this.f14546c))) || (!z11 && !z10 && !n(this.f14546c) && !k(UrlTreeKt.configurablePathSegmentSuffixChar, this.f14546c) && !k(UrlTreeKt.configurablePathSegmentPrefixChar, this.f14546c))))) {
                stringBuffer.append(this.f14545b[this.f14546c]);
                p();
                g(1);
            }
            if (k('\'', this.f14546c) && z11) {
                p();
                g(1);
            } else if (k('\"', this.f14546c) && z10) {
                p();
                g(1);
            }
            eVar.getClass();
            return stringBuffer.toString();
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public final void d() {
        boolean z10 = this.f14554k;
        e eVar = this.f14557n;
        if (!z10) {
            eVar.getClass();
            f();
            return;
        }
        if (r("/*<![CDATA[*/")) {
            g(13);
        } else if (r("//<![CDATA[")) {
            g(11);
        } else {
            g(9);
        }
        StringBuffer stringBuffer = this.f14548e;
        int length = stringBuffer.length();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.f14545b);
        String stringBuffer3 = stringBuffer2.toString();
        if (!stringBuffer3.contains("]]>") && !stringBuffer3.contains("/*]]>*/") && !stringBuffer3.contains("//]]>")) {
            BufferedReader bufferedReader = this.f14544a;
            if (bufferedReader.markSupported()) {
                bufferedReader.mark(524288);
                StringBuffer stringBuffer4 = new StringBuffer();
                int i10 = 0;
                while (true) {
                    int read = bufferedReader.read();
                    if (read == -1 || i10 >= 524287) {
                        break;
                    }
                    i10++;
                    stringBuffer4.append((char) read);
                    String stringBuffer5 = stringBuffer4.toString();
                    if (stringBuffer5.contains("]]>") || stringBuffer5.contains("/*]]>*/") || stringBuffer5.contains("//]]>")) {
                        break;
                    } else if (stringBuffer4.length() > 16) {
                        stringBuffer4.delete(0, 8);
                    }
                }
                bufferedReader.reset();
            }
            g(length - stringBuffer.length());
            return;
        }
        while (!j() && !r("/*]]>*/") && !r("]]>") && !r("//]]>")) {
            p();
            g(1);
        }
        if (r("/*]]>*/")) {
            g(7);
        } else if (r("//]]>")) {
            g(5);
        } else if (r("]]>")) {
            g(3);
        } else {
            g(length - stringBuffer.length());
            return;
        }
        if (stringBuffer.length() > 0) {
            if (!this.f14554k) {
                eVar.getClass();
            }
            b(new g(stringBuffer.toString().substring(length)));
        }
        stringBuffer.delete(length, stringBuffer.length());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [dv.f, java.lang.Object, dv.a] */
    public final void e() {
        g(4);
        while (!j() && !r("-->")) {
            p();
            g(1);
        }
        if (r("-->")) {
            g(3);
        }
        StringBuffer stringBuffer = this.f14548e;
        if (stringBuffer.length() > 0) {
            e eVar = this.f14557n;
            eVar.getClass();
            String str = eVar.f14526i;
            String replaceAll = stringBuffer.toString().replaceAll("--", str + str);
            if (replaceAll.length() > 0 && replaceAll.charAt(0) == '-') {
                StringBuilder p10 = da.e.p(str);
                p10.append(replaceAll.substring(1));
                replaceAll = p10.toString();
            }
            int length = replaceAll.length();
            if (length > 0) {
                int i10 = length - 1;
                if (replaceAll.charAt(i10) == '-') {
                    replaceAll = replaceAll.substring(0, i10) + str;
                }
            }
            ?? obj = new Object();
            obj.f14532b = replaceAll;
            b(obj);
            stringBuffer.delete(0, stringBuffer.length());
        }
    }

    public final boolean f() {
        while (!j()) {
            p();
            g(1);
            if (r("/*<![CDATA[*/") || r("<![CDATA[") || r("//<![CDATA[") || r("</") || r("<!") || r("<?") || (r(UrlTreeKt.configurablePathSegmentPrefix) && l(this.f14546c + 1))) {
                break;
            }
        }
        return a();
    }

    public final void g(int i10) {
        this.f14546c += i10;
        o(i10 - 1);
        if (this.f14546c < 0) {
            this.f14546c = 0;
        }
    }

    public final String h(boolean z10) {
        int i10;
        char c10;
        this.f14553j = true;
        int i11 = this.f14546c;
        char[] cArr = this.f14545b;
        if (cArr[i11] == '<' || !m(i11)) {
            this.f14553j = false;
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (!j()) {
            if (!z10 || !m(this.f14546c)) {
                if (!z10) {
                    int i12 = this.f14546c;
                    if (!m(i12) || (((i10 = this.f14547d) >= 0 && i12 >= i10) || (c10 = cArr[i12]) == '>' || c10 == '/' || c10 == ' ' || c10 == '<' || Character.isSpaceChar(c10))) {
                        break;
                    }
                } else {
                    break;
                }
            }
            p();
            stringBuffer.append(cArr[this.f14546c]);
            g(1);
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        String stringBuffer2 = stringBuffer.toString();
        int indexOf = stringBuffer2.indexOf(58);
        if (indexOf >= 0) {
            String substring = stringBuffer2.substring(0, indexOf);
            stringBuffer2 = stringBuffer2.substring(indexOf + 1);
            int indexOf2 = stringBuffer2.indexOf(58);
            if (indexOf2 >= 0) {
                stringBuffer2 = stringBuffer2.substring(0, indexOf2);
            }
            if (this.f14557n.f14523f) {
                stringBuffer2 = a3.a.g(substring, ":", stringBuffer2);
                if (!"xmlns".equalsIgnoreCase(substring)) {
                    this.f14552i.add(substring.toLowerCase());
                }
            }
        }
        return stringBuffer2;
    }

    public final void i() {
        while (!j()) {
            g(1);
            char[] cArr = this.f14545b;
            int i10 = this.f14546c;
            char c10 = cArr[i10];
            if (k(UrlTreeKt.configurablePathSegmentPrefixChar, i10)) {
                return;
            }
        }
    }

    public final boolean j() {
        int i10 = this.f14547d;
        return i10 >= 0 && this.f14546c >= i10;
    }

    public final boolean k(char c10, int i10) {
        int i11 = this.f14547d;
        if ((i11 >= 0 && i10 >= i11) || Character.toLowerCase(c10) != Character.toLowerCase(this.f14545b[i10])) {
            return false;
        }
        return true;
    }

    public final boolean l(int i10) {
        int i11 = this.f14547d;
        if (i11 >= 0 && i10 >= i11) {
            return false;
        }
        return Character.isUnicodeIdentifierStart(this.f14545b[i10]);
    }

    public final boolean m(int i10) {
        int i11 = this.f14547d;
        if (i11 >= 0 && i10 >= i11) {
            return false;
        }
        char c10 = this.f14545b[i10];
        if (Character.isWhitespace(c10) || c10 == 0 || c10 == 65533 || c10 == '\"' || c10 == "'".charAt(0) || c10 == '>' || c10 == '/' || c10 == '=' || Character.isISOControl(c10) || !Character.isDefined(c10)) {
            return false;
        }
        return true;
    }

    public final boolean n(int i10) {
        int i11 = this.f14547d;
        if (i11 >= 0 && i10 >= i11) {
            return false;
        }
        return Character.isWhitespace(this.f14545b[i10]);
    }

    public final void o(int i10) {
        if (this.f14547d == -1) {
            int i11 = this.f14546c;
            if (i10 + i11 >= 1024) {
                int i12 = 1024 - i11;
                char[] cArr = this.f14545b;
                int i13 = 0;
                System.arraycopy(cArr, i11, cArr, 0, i12);
                this.f14546c = 0;
                int i14 = 1024 - i12;
                int i15 = i12;
                int i16 = 0;
                do {
                    int read = this.f14544a.read(cArr, i15, i14);
                    if (read >= 0) {
                        i16 += read;
                        i15 += read;
                        i14 -= read;
                    }
                    if (read < 0) {
                        break;
                    }
                } while (i14 > 0);
                if (i14 > 0) {
                    this.f14547d = i16 + i12;
                }
                while (true) {
                    int i17 = this.f14547d;
                    if (i17 < 0) {
                        i17 = 1024;
                    }
                    if (i13 < i17) {
                        char c10 = cArr[i13];
                        if (c10 >= 1 && c10 <= ' ' && c10 != '\n' && c10 != '\r') {
                            cArr[i13] = ' ';
                        }
                        if (c10 == 0) {
                            cArr[i13] = 65533;
                        }
                        i13++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void p() {
        if (!j()) {
            this.f14548e.append(this.f14545b[this.f14546c]);
        }
    }

    public final void q() {
        while (!j() && n(this.f14546c)) {
            p();
            g(1);
        }
    }

    public final boolean r(String str) {
        int length = str.length();
        o(length);
        int i10 = this.f14547d;
        if (i10 >= 0 && this.f14546c + length > i10) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (Character.toLowerCase(str.charAt(i11)) != Character.toLowerCase(this.f14545b[this.f14546c + i11])) {
                return false;
            }
        }
        return true;
    }

    public final void s() {
        String str;
        while (!j() && this.f14553j && !k(UrlTreeKt.configurablePathSegmentSuffixChar, this.f14546c) && !r("/>") && !Thread.currentThread().isInterrupted()) {
            q();
            String h10 = h(true);
            if (!this.f14553j) {
                if (!k(UrlTreeKt.configurablePathSegmentPrefixChar, this.f14546c) && !k(UrlTreeKt.configurablePathSegmentSuffixChar, this.f14546c) && !r("/>")) {
                    p();
                    g(1);
                }
                if (!k(UrlTreeKt.configurablePathSegmentPrefixChar, this.f14546c)) {
                    this.f14553j = true;
                }
            } else {
                q();
                if (k('=', this.f14546c)) {
                    p();
                    g(1);
                    str = c();
                } else {
                    e eVar = this.f14557n;
                    if ("empty".equals(eVar.f14521d)) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else if ("true".equals(eVar.f14521d)) {
                        str = "true";
                    } else {
                        str = h10;
                    }
                }
                if (this.f14553j) {
                    this.f14550g.b(h10, str);
                }
            }
        }
    }

    public final void t() {
        o(2);
        int i10 = this.f14546c;
        for (int i11 = 2; !j() && i11 > 0; i11--) {
            this.f14548e.append(this.f14545b[i10]);
            i10++;
        }
        g(2);
        if (j()) {
            return;
        }
        String h10 = h(false);
        wn.e eVar = this.f14558o;
        if (eVar != null && h10 != null && ((Map) eVar.f39327b).containsKey(h10.toLowerCase()) && eVar.n(h10) != null) {
            h10 = null;
        }
        e eVar2 = this.f14557n;
        if (h10 != null) {
            r f10 = this.f14556m.f(h10, this.f14559p);
            if (f10 == null) {
                eVar2.getClass();
            }
            if (f10 != null && f10.f14587n) {
                eVar2.getClass();
            }
        }
        this.f14550g = new i(h10);
        if (this.f14553j) {
            q();
            s();
            if (h10 != null) {
                b(this.f14550g);
            }
            if (k(UrlTreeKt.configurablePathSegmentSuffixChar, this.f14546c)) {
                g(1);
            }
            List list = eVar2.f14519b;
            if (list != null && h10 != null && list.contains(h10.toLowerCase())) {
                this.f14554k = false;
                this.f14555l = h10;
            }
            if (h10 != null && h10.equalsIgnoreCase("html")) {
                q();
            }
            this.f14550g = null;
            return;
        }
        a();
    }
}
