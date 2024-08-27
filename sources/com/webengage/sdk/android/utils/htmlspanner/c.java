package com.webengage.sdk.android.utils.htmlspanner;

import android.graphics.Paint;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.webengage.sdk.android.utils.htmlspanner.l.i;
import com.webengage.sdk.android.utils.htmlspanner.l.j;
import com.webengage.sdk.android.utils.htmlspanner.l.l;
import com.webengage.sdk.android.utils.htmlspanner.l.m;
import com.webengage.sdk.android.utils.htmlspanner.n.a;
import com.webengage.sdk.android.utils.htmlspanner.n.c;
import dv.k;
import dv.s;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import yk.u;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static int f12731a = 5;

    /* renamed from: b, reason: collision with root package name */
    public static int f12732b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static int f12733c = 10;

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, String> f12734d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, g> f12735e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12736f;

    /* renamed from: g, reason: collision with root package name */
    private k f12737g;

    /* renamed from: h, reason: collision with root package name */
    private b f12738h;

    /* renamed from: i, reason: collision with root package name */
    private int f12739i;

    /* renamed from: j, reason: collision with root package name */
    private int f12740j;

    /* renamed from: k, reason: collision with root package name */
    private float f12741k;

    /* renamed from: l, reason: collision with root package name */
    private Boolean f12742l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12743m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12744n;

    /* loaded from: classes2.dex */
    public interface a {
        boolean a();
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f12734d = linkedHashMap;
        linkedHashMap.put("\r\n", "\n");
        f12734d.put("\r", "\n");
        f12734d.put("\n", "<br>");
        f12734d.put("&gt;", UrlTreeKt.configurablePathSegmentSuffix);
        f12734d.put("&lt;", UrlTreeKt.configurablePathSegmentPrefix);
        f12734d.put("&bull;", "•");
        f12734d.put("&#39;", "'");
        f12734d.put("&euro;", "€");
        f12734d.put("&#36;", "$");
        f12734d.put("&nbsp;", " ");
        f12734d.put("&rsquo;", "'");
        f12734d.put("&lsquo;", "'");
        f12734d.put("&ldquo;", "\"");
        f12734d.put("&rdquo;", "\"");
        f12734d.put("&ndash;", "-");
        f12734d.put("&#95;", "_");
        f12734d.put("&copy;", "&#169;");
        f12734d.put("&divide;", "&#247;");
        f12734d.put("&micro;", "&#181;");
        f12734d.put("&middot;", "&#183;");
        f12734d.put("&para;", "&#182;");
        f12734d.put("&plusmn;", "&#177;");
        f12734d.put("&reg;", "&#174;");
        f12734d.put("&sect;", "&#167;");
        f12734d.put("&trade;", "&#153;");
        f12734d.put("&yen;", "&#165;");
        f12734d.put("&pound;", "£");
        f12734d.put("&raquo;", ">>");
        f12734d.put("&laquo;", "<<");
        f12734d.put("&hellip;", "...");
        f12734d.put("&agrave;", "à");
        f12734d.put("&egrave;", "è");
        f12734d.put("&igrave;", "ì");
        f12734d.put("&ograve;", "ò");
        f12734d.put("&ugrave;", "ù");
        f12734d.put("&aacute;", "á");
        f12734d.put("&eacute;", "é");
        f12734d.put("&iacute;", "í");
        f12734d.put("&oacute;", "ó");
        f12734d.put("&uacute;", "ú");
        f12734d.put("&Agrave;", "À");
        f12734d.put("&Egrave;", "È");
        f12734d.put("&Igrave;", "Ì");
        f12734d.put("&Ograve;", "Ò");
        f12734d.put("&Ugrave;", "Ù");
        f12734d.put("&Aacute;", "Á");
        f12734d.put("&Eacute;", "É");
        f12734d.put("&Iacute;", "Í");
        f12734d.put("&Oacute;", "Ó");
        f12734d.put("&Uacute;", "Ú");
        f12734d.put("<h1>", "<h1 style=\"font-weight:bold\">");
        f12734d.put("<h2>", "<h2 style=\"font-weight:bold\">");
    }

    public c(int i10, float f10) {
        this(a(), new f(), i10, f10);
    }

    private void g() {
        g iVar = new i(new com.webengage.sdk.android.utils.htmlspanner.n.a().a(a.c.ITALIC));
        a("i", iVar);
        a("em", iVar);
        a("cite", iVar);
        a("dfn", iVar);
        g iVar2 = new i(new com.webengage.sdk.android.utils.htmlspanner.n.a().a(a.d.BOLD));
        a("b", iVar2);
        a("bold", iVar2);
        a("strong", iVar2);
        a(u.f41726f, new m());
        com.webengage.sdk.android.utils.htmlspanner.n.a aVar = new com.webengage.sdk.android.utils.htmlspanner.n.a();
        c.a aVar2 = c.a.EM;
        a("blockquote", new i(aVar.e(new com.webengage.sdk.android.utils.htmlspanner.n.c(2.0f, aVar2))));
        com.webengage.sdk.android.utils.htmlspanner.n.a aVar3 = new com.webengage.sdk.android.utils.htmlspanner.n.a();
        a.b bVar = a.b.BLOCK;
        g bVar2 = new com.webengage.sdk.android.utils.htmlspanner.l.o.b(a(new i(aVar3.a(bVar))));
        a("ul", bVar2);
        a("ol", bVar2);
        g a10 = a(new com.webengage.sdk.android.utils.htmlspanner.l.e());
        a("tt", a10);
        a("code", a10);
        a("style", new com.webengage.sdk.android.utils.htmlspanner.l.h());
        g fVar = new com.webengage.sdk.android.utils.htmlspanner.l.f(1, a(new i()));
        a("br", fVar);
        a("br/", fVar);
        a.EnumC0010a valueOf = a.EnumC0010a.valueOf("solid".toUpperCase());
        a("hr", new com.webengage.sdk.android.utils.htmlspanner.l.o.c(a(new i(new com.webengage.sdk.android.utils.htmlspanner.n.a().a(bVar)))));
        g bVar3 = new com.webengage.sdk.android.utils.htmlspanner.l.o.b(a(new i(new com.webengage.sdk.android.utils.htmlspanner.n.a().a(bVar).d(new com.webengage.sdk.android.utils.htmlspanner.n.c(4)).a(valueOf).b(Integer.valueOf(this.f12739i)))));
        com.webengage.sdk.android.utils.htmlspanner.n.a d10 = new com.webengage.sdk.android.utils.htmlspanner.n.a().a(a.b.INLINE).d(new com.webengage.sdk.android.utils.htmlspanner.n.c(1.0f, aVar2));
        g bVar4 = new com.webengage.sdk.android.utils.htmlspanner.l.o.b(a(new i(d10)));
        a("p", bVar3);
        a("div", bVar3);
        a("span", bVar4);
        l lVar = new l();
        lVar.a(this.f12741k * 0.83f);
        lVar.a(this.f12740j);
        Boolean bool = this.f12742l;
        if (bool != null) {
            lVar.a(bool.booleanValue());
        }
        a("table", lVar);
        a("h1", a(new com.webengage.sdk.android.utils.htmlspanner.l.b(2.0f, 0.5f)));
        a("h2", a(new com.webengage.sdk.android.utils.htmlspanner.l.b(1.5f, 0.6f)));
        a("h3", a(new com.webengage.sdk.android.utils.htmlspanner.l.b(1.17f, 0.7f)));
        a("h4", a(new com.webengage.sdk.android.utils.htmlspanner.l.b(1.12f, 0.8f)));
        a("h5", a(new com.webengage.sdk.android.utils.htmlspanner.l.b(0.83f, 0.9f)));
        a("h6", a(new com.webengage.sdk.android.utils.htmlspanner.l.b(0.75f, 1.0f)));
        a("pre", new com.webengage.sdk.android.utils.htmlspanner.l.g());
        a("big", new i(new com.webengage.sdk.android.utils.htmlspanner.n.a().b(new com.webengage.sdk.android.utils.htmlspanner.n.c(1.25f, aVar2))));
        a("small", new i(new com.webengage.sdk.android.utils.htmlspanner.n.a().b(new com.webengage.sdk.android.utils.htmlspanner.n.c(0.8f, aVar2))));
        a("sub", new j());
        a("sup", new com.webengage.sdk.android.utils.htmlspanner.l.k());
        a("center", new i(new com.webengage.sdk.android.utils.htmlspanner.n.a().a(a.e.CENTER)));
        a("li", new com.webengage.sdk.android.utils.htmlspanner.l.d(a(new i(d10))));
        a("a", new com.webengage.sdk.android.utils.htmlspanner.l.c());
        a("font", new com.webengage.sdk.android.utils.htmlspanner.l.a());
    }

    public Spannable a(s sVar, a aVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e eVar = new e();
        a(spannableStringBuilder, sVar, eVar, aVar);
        eVar.a(this, spannableStringBuilder);
        return spannableStringBuilder;
    }

    public com.webengage.sdk.android.utils.htmlspanner.a b(String str) {
        return this.f12738h.a(str);
    }

    public float c() {
        return this.f12741k;
    }

    public boolean d() {
        return this.f12743m;
    }

    public boolean e() {
        return this.f12736f;
    }

    public boolean f() {
        return this.f12744n;
    }

    public c(k kVar, b bVar, int i10, float f10) {
        this.f12736f = false;
        this.f12742l = null;
        this.f12743m = true;
        this.f12744n = true;
        a(kVar, bVar);
        b(i10);
        b(f10);
        a(f10);
        g();
    }

    private static i a(i iVar) {
        return new com.webengage.sdk.android.utils.htmlspanner.l.o.d(new com.webengage.sdk.android.utils.htmlspanner.l.o.a(iVar));
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (Map.Entry<String, String> entry : f12734d.entrySet()) {
            str = str.replace(entry.getKey(), entry.getValue()).replace(entry.getKey().toUpperCase(), entry.getValue());
        }
        return str;
    }

    public b b() {
        return this.f12738h;
    }

    private void a(float f10) {
        Paint paint = new Paint();
        paint.setTextSize(f10);
        f12731a = Math.round(paint.measureText("4."));
        f12732b = Math.round(paint.measureText("•"));
        f12733c = Math.round(paint.measureText(" "));
    }

    public void b(float f10) {
        this.f12741k = f10;
    }

    public void a(int i10) {
        this.f12739i = i10;
    }

    public void b(int i10) {
        this.f12740j = i10;
    }

    private void a(SpannableStringBuilder spannableStringBuilder, Object obj, e eVar, a aVar) {
        a(aVar);
        String a10 = h.a(((dv.g) obj).b().toString(), false);
        if (e()) {
            a10 = a10.replace((char) 160, ' ');
        }
        if (a10.length() > 0) {
            spannableStringBuilder.append((CharSequence) a10);
        }
    }

    private void a(a aVar) {
        if (aVar != null && aVar.a()) {
            throw new com.webengage.sdk.android.utils.htmlspanner.k.a();
        }
    }

    private void a(k kVar, b bVar) {
        this.f12735e = new HashMap();
        this.f12737g = kVar;
        this.f12738h = bVar;
    }

    public void a(String str, g gVar) {
        this.f12735e.put(str, gVar);
        gVar.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dv.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [dv.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [ev.c, java.lang.Object] */
    private static k a() {
        ?? obj = new Object();
        ?? obj2 = new Object();
        wn.e eVar = new wn.e(21);
        obj2.f14527j = eVar;
        obj2.f14529l = new HashSet();
        HashSet hashSet = new HashSet();
        obj2.f14530m = hashSet;
        obj2.f14519b = Arrays.asList("script,style".toLowerCase().split(","));
        obj2.f14531n = 3;
        obj2.f14520c = true;
        obj2.f14522e = true;
        obj2.f14523f = true;
        obj2.f14525h = true;
        obj2.f14526i = "=";
        HashSet hashSet2 = obj2.f14529l;
        hashSet2.clear();
        ev.b bVar = ev.b.f15867a;
        hashSet2.add(bVar);
        hashSet.clear();
        obj2.f14521d = "self";
        eVar.clear();
        HashSet hashSet3 = obj2.f14529l;
        hashSet3.clear();
        hashSet3.add(bVar);
        dv.j jVar = dv.j.f14540b;
        obj2.f14518a = jVar;
        obj2.f14528k = new ArrayList();
        obj2.f14524g = true;
        obj.f14542a = obj2;
        if (obj2.f14518a == null) {
            obj2.f14518a = jVar;
        }
        obj2.f14524g = true;
        obj2.f14522e = true;
        HashSet hashSet4 = obj2.f14529l;
        hashSet4.clear();
        hashSet4.add(bVar);
        HashSet hashSet5 = obj2.f14529l;
        StringTokenizer stringTokenizer = new StringTokenizer("script,title", ",");
        while (stringTokenizer.hasMoreTokens()) {
            String lowerCase = stringTokenizer.nextToken().trim().toLowerCase();
            ?? obj3 = new Object();
            obj3.f15868a = lowerCase;
            hashSet5.add(obj3);
        }
        return obj;
    }

    public Spannable a(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            str = c(str);
        }
        k kVar = this.f12737g;
        kVar.getClass();
        try {
            return a(kVar.c(new StringReader(str), new dv.d()), (a) null);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void a(SpannableStringBuilder spannableStringBuilder, s sVar, e eVar, a aVar) {
        a(aVar);
        g gVar = this.f12735e.get(sVar.c());
        if (gVar == null) {
            gVar = new i();
            gVar.a(this);
        }
        g gVar2 = gVar;
        int length = spannableStringBuilder.length();
        gVar2.a(sVar, spannableStringBuilder, eVar);
        if (!gVar2.b()) {
            Iterator it = sVar.f14590d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof dv.g) {
                    a(spannableStringBuilder, next, eVar, aVar);
                } else if (next instanceof s) {
                    a(spannableStringBuilder, (s) next, eVar, aVar);
                }
            }
        }
        gVar2.a(sVar, spannableStringBuilder, length, spannableStringBuilder.length(), eVar);
    }
}
