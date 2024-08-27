package y6;

import android.text.Layout;
import androidx.media3.extractor.text.SubtitleDecoderException;
import d4.c0;
import e5.m;
import e5.x;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class d extends s6.a {

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f41236n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f41237o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f41238p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f41239q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f41240r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f41241s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f41242t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u, reason: collision with root package name */
    public static final c f41243u = new c(1, 30.0f, 1);

    /* renamed from: v, reason: collision with root package name */
    public static final c0 f41244v = new c0(32, 15);

    /* renamed from: m, reason: collision with root package name */
    public final XmlPullParserFactory f41245m;

    public d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f41245m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static g h(g gVar) {
        if (gVar == null) {
            return new g();
        }
        return gVar;
    }

    public static boolean i(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static Layout.Alignment j(String str) {
        String P1 = dp.b.P1(str);
        P1.getClass();
        char c10 = 65535;
        switch (P1.hashCode()) {
            case -1364013995:
                if (P1.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (P1.equals("end")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (P1.equals("left")) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (P1.equals("right")) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (P1.equals("start")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static c0 k(XmlPullParser xmlPullParser, c0 c0Var) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c0Var;
        }
        Matcher matcher = f41242t.matcher(attributeValue);
        if (!matcher.matches()) {
            m.f("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return c0Var;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new c0(parseInt, parseInt2);
            }
            throw new Exception("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            m.f("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return c0Var;
        }
    }

    public static void l(String str, g gVar) {
        Matcher matcher;
        int i10 = x.f15050a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f41238p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            m.f("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(nn.d.m(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            group.hashCode();
            char c10 = 65535;
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    gVar.f41278j = 3;
                    break;
                case 1:
                    gVar.f41278j = 2;
                    break;
                case 2:
                    gVar.f41278j = 1;
                    break;
                default:
                    throw new Exception(nn.d.k("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            gVar.f41279k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(nn.d.k("Invalid expression for fontSize: '", str, "'."));
    }

    public static c m(XmlPullParser xmlPullParser) {
        int i10;
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = x.f15050a;
            if (attributeValue2.split(" ", -1).length == 2) {
                f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new Exception("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f10 = 1.0f;
        }
        c cVar = f41243u;
        int i12 = cVar.f41233a;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = cVar.f41235c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new c(i12, i10 * f10, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x023b, code lost:
    
        if (e5.a.o(r19, "metadata") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x023d, code lost:
    
        r19.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0246, code lost:
    
        if (e5.a.o(r19, "image") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0248, code lost:
    
        r7 = e5.a.k(r19, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024c, code lost:
    
        if (r7 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x024e, code lost:
    
        r24.put(r7, r19.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x025e, code lost:
    
        if (e5.a.m(r19, "metadata") == false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(org.xmlpull.v1.XmlPullParser r19, java.util.HashMap r20, d4.c0 r21, d4.c0 r22, java.util.HashMap r23, java.util.HashMap r24) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.d.n(org.xmlpull.v1.XmlPullParser, java.util.HashMap, d4.c0, d4.c0, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x007c. Please report as an issue. */
    public static e o(XmlPullParser xmlPullParser, e eVar, HashMap hashMap, c cVar) {
        long j10;
        long j11;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        g p10 = p(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    if (hashMap.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    j14 = q(attributeValue, cVar);
                    break;
                case 2:
                    j13 = q(attributeValue, cVar);
                    break;
                case 3:
                    j12 = q(attributeValue, cVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i11 = x.f15050a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                    }
            }
        }
        if (eVar != null) {
            long j15 = eVar.f41249d;
            j10 = -9223372036854775807L;
            if (j15 != -9223372036854775807L) {
                if (j12 != -9223372036854775807L) {
                    j12 += j15;
                }
                if (j13 != -9223372036854775807L) {
                    j13 += j15;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (j13 == j10) {
            if (j14 != j10) {
                j11 = j12 + j14;
            } else if (eVar != null) {
                long j16 = eVar.f41250e;
                if (j16 != j10) {
                    j11 = j16;
                }
            }
            return new e(xmlPullParser.getName(), null, j12, j11, p10, strArr, str2, str, eVar);
        }
        j11 = j13;
        return new e(xmlPullParser.getName(), null, j12, j11, p10, strArr, str2, str, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x009e, code lost:
    
        if (r6.equals("id") == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:134:0x031e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:171:0x03ba. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static y6.g p(org.xmlpull.v1.XmlPullParser r16, y6.g r17) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.d.p(org.xmlpull.v1.XmlPullParser, y6.g):y6.g");
    }

    public static long q(String str, c cVar) {
        double d10;
        double d11;
        double d12;
        double d13;
        Matcher matcher = f41236n.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            double d14 = 0.0d;
            if (group2 != null) {
                d12 = Double.parseDouble(group2);
            } else {
                d12 = 0.0d;
            }
            double d15 = parseLong3 + d12;
            String group3 = matcher.group(5);
            if (group3 != null) {
                d13 = ((float) Long.parseLong(group3)) / cVar.f41234b;
            } else {
                d13 = 0.0d;
            }
            double d16 = d15 + d13;
            if (matcher.group(6) != null) {
                d14 = (Long.parseLong(r13) / cVar.f41233a) / cVar.f41234b;
            }
            return (long) ((d16 + d14) * 1000000.0d);
        }
        Matcher matcher2 = f41237o.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            double parseDouble = Double.parseDouble(group4);
            String group5 = matcher2.group(2);
            group5.getClass();
            group5.hashCode();
            char c10 = 65535;
            switch (group5.hashCode()) {
                case 102:
                    if (group5.equals("f")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 104:
                    if (group5.equals("h")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109:
                    if (group5.equals("m")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 116:
                    if (group5.equals("t")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3494:
                    if (group5.equals("ms")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    d10 = cVar.f41234b;
                    parseDouble /= d10;
                    break;
                case 1:
                    d11 = 3600.0d;
                    break;
                case 2:
                    d11 = 60.0d;
                    break;
                case 3:
                    d10 = cVar.f41235c;
                    parseDouble /= d10;
                    break;
                case 4:
                    d10 = 1000.0d;
                    parseDouble /= d10;
                    break;
            }
            parseDouble *= d11;
            return (long) (parseDouble * 1000000.0d);
        }
        throw new Exception(a3.a.f("Malformed time expression: ", str));
    }

    public static c0 r(XmlPullParser xmlPullParser) {
        String k10 = e5.a.k(xmlPullParser, "extent");
        if (k10 == null) {
            return null;
        }
        Matcher matcher = f41241s.matcher(k10);
        if (!matcher.matches()) {
            m.f("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(k10));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new c0(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            m.f("TtmlDecoder", "Ignoring malformed tts extent: ".concat(k10));
            return null;
        }
    }

    @Override // s6.a
    public final s6.b f(byte[] bArr, int i10, boolean z10) {
        c0 c0Var;
        c cVar;
        try {
            XmlPullParser newPullParser = this.f41245m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put(HttpUrl.FRAGMENT_ENCODE_SET, new f(HttpUrl.FRAGMENT_ENCODE_SET, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            c0 c0Var2 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            c cVar2 = f41243u;
            c0 c0Var3 = f41244v;
            int i11 = 0;
            h hVar = null;
            c0 c0Var4 = c0Var3;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                e eVar = (e) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            cVar2 = m(newPullParser);
                            c0Var4 = k(newPullParser, c0Var3);
                            c0Var2 = r(newPullParser);
                        }
                        c0 c0Var5 = c0Var4;
                        c0 c0Var6 = c0Var2;
                        c cVar3 = cVar2;
                        if (!i(name)) {
                            m.e("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i11++;
                            c0Var4 = c0Var5;
                            cVar2 = cVar3;
                        } else {
                            if ("head".equals(name)) {
                                c0Var = c0Var5;
                                cVar = cVar3;
                                n(newPullParser, hashMap, c0Var5, c0Var6, hashMap2, hashMap3);
                            } else {
                                c0Var = c0Var5;
                                cVar = cVar3;
                                try {
                                    e o10 = o(newPullParser, eVar, hashMap2, cVar);
                                    arrayDeque.push(o10);
                                    if (eVar != null) {
                                        if (eVar.f41258m == null) {
                                            eVar.f41258m = new ArrayList();
                                        }
                                        eVar.f41258m.add(o10);
                                    }
                                } catch (SubtitleDecoderException e10) {
                                    m.g("TtmlDecoder", "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            c0Var4 = c0Var;
                            cVar2 = cVar;
                        }
                        c0Var2 = c0Var6;
                    } else if (eventType == 4) {
                        eVar.getClass();
                        e a10 = e.a(newPullParser.getText());
                        if (eVar.f41258m == null) {
                            eVar.f41258m = new ArrayList();
                        }
                        eVar.f41258m.add(a10);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            e eVar2 = (e) arrayDeque.peek();
                            eVar2.getClass();
                            hVar = new h(eVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new Exception("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new Exception("Unable to decode source", e12);
        }
    }
}
