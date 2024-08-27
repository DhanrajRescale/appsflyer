package m5;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import com.airbnb.deeplinkdispatch.base.MatchIndex;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e5.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lp.g0;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class e extends DefaultHandler implements v5.q {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f27535b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f27536c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f27537d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f27538e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f27539a;

    public e() {
        try {
            this.f27539a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long a(ArrayList arrayList, long j10, long j11, int i10, long j12) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = x.f15050a;
            i11 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(new q(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (!e5.a.n(xmlPullParser)) {
            return;
        }
        int i10 = 1;
        while (i10 != 0) {
            xmlPullParser.next();
            if (e5.a.n(xmlPullParser)) {
                i10++;
            } else if (xmlPullParser.getEventType() == 3) {
                i10--;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        if (r0 == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0085, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
    
        if (r0.equals("4000") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f3, code lost:
    
        if (r0 < 33) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(org.xmlpull.v1.XmlPullParser r9) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.e.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList e(XmlPullParser xmlPullParser, List list, boolean z10) {
        int i10;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i11 = 1;
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else if (z10) {
            i10 = 1;
        } else {
            i10 = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i11 = Integer.parseInt(attributeValue2);
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!e5.a.m(xmlPullParser, "BaseURL"));
        if (str2 != null && vl.b.D(str2)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str2;
            }
            return g0.k(new b(str2, attributeValue3, i10, i11));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            b bVar = (b) list.get(i12);
            String e02 = vl.b.e0(bVar.f27509a, str2);
            if (attributeValue3 == null) {
                str = e02;
            } else {
                str = attributeValue3;
            }
            if (z10) {
                i10 = bVar.f27511c;
                i11 = bVar.f27512d;
                str = bVar.f27510b;
            }
            arrayList.add(new b(e02, str, i10, i11));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.e.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        if (!"image".equals(attributeValue)) {
            return -1;
        }
        return 4;
    }

    public static f h(XmlPullParser xmlPullParser, String str) {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!e5.a.m(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j10) {
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = x.f15057h.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d15 = 0.0d;
            if (group != null) {
                d10 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d10 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d11 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d11 = 0.0d;
            }
            double d16 = d10 + d11;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d12 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d12 = 0.0d;
            }
            double d17 = d16 + d12;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d13 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d13 = 0.0d;
            }
            double d18 = d17 + d13;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d14 = Double.parseDouble(group5) * 60.0d;
            } else {
                d14 = 0.0d;
            }
            double d19 = d18 + d14;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d15 = Double.parseDouble(group6);
            }
            long j11 = (long) ((d19 + d15) * 1000.0d);
            if (isEmpty) {
                return -j11;
            }
            return j11;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static float k(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f27535b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                if (!TextUtils.isEmpty(matcher.group(2))) {
                    return parseInt / Integer.parseInt(r2);
                }
                return parseInt;
            }
            return f10;
        }
        return f10;
    }

    public static int l(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Integer.parseInt(attributeValue);
        }
        return i10;
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Long.parseLong(attributeValue);
        }
        return j10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0956, code lost:
    
        if ("audio/eac3-joc".equals(r0) != false) goto L277;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:611:0x1049. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0f38 A[LOOP:5: B:155:0x03cb->B:163:0x0f38, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0dca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0c35 A[LOOP:11: B:305:0x0677->B:314:0x0c35, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x099a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x1314 A[LOOP:1: B:34:0x00d2->B:42:0x1314, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x12e0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v67, types: [java.lang.Object, b5.d0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m5.c n(org.xmlpull.v1.XmlPullParser r159, android.net.Uri r160) {
        /*
            Method dump skipped, instructions count: 4958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.e.n(org.xmlpull.v1.XmlPullParser, android.net.Uri):m5.c");
    }

    public static j o(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j10 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j11 = (Long.parseLong(split[1]) - j10) + 1;
                return new j(j10, j11, attributeValue);
            }
        } else {
            j10 = 0;
        }
        j11 = -1;
        return new j(j10, j11, attributeValue);
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c10 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return 512;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case '\b':
                return 256;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case 11:
                return 32;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    public static int q(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (dp.b.i1("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).f27540a)) {
                i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }
        return i10;
    }

    public static r r(XmlPullParser xmlPullParser, r rVar) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (rVar != null) {
            j10 = rVar.f27586b;
        } else {
            j10 = 1;
        }
        long m10 = m(xmlPullParser, "timescale", j10);
        long j15 = 0;
        if (rVar != null) {
            j11 = rVar.f27587c;
        } else {
            j11 = 0;
        }
        long m11 = m(xmlPullParser, "presentationTimeOffset", j11);
        if (rVar != null) {
            j12 = rVar.f27583d;
        } else {
            j12 = 0;
        }
        if (rVar != null) {
            j15 = rVar.f27584e;
        }
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j13 = (Long.parseLong(split[1]) - parseLong) + 1;
            j14 = parseLong;
        } else {
            j13 = j15;
            j14 = j12;
        }
        if (rVar != null) {
            jVar = rVar.f27585a;
        }
        do {
            xmlPullParser.next();
            if (e5.a.o(xmlPullParser, "Initialization")) {
                jVar = o(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
        } while (!e5.a.m(xmlPullParser, "SegmentBase"));
        return new r(jVar, m10, m11, j14, j13);
    }

    public static o s(XmlPullParser xmlPullParser, o oVar, long j10, long j11, long j12, long j13, long j14) {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20 = 1;
        if (oVar != null) {
            j15 = oVar.f27586b;
        } else {
            j15 = 1;
        }
        long m10 = m(xmlPullParser, "timescale", j15);
        if (oVar != null) {
            j16 = oVar.f27587c;
        } else {
            j16 = 0;
        }
        long m11 = m(xmlPullParser, "presentationTimeOffset", j16);
        if (oVar != null) {
            j17 = oVar.f27572e;
        } else {
            j17 = -9223372036854775807L;
        }
        long m12 = m(xmlPullParser, "duration", j17);
        if (oVar != null) {
            j20 = oVar.f27571d;
        }
        long m13 = m(xmlPullParser, "startNumber", j20);
        if (j13 == -9223372036854775807L) {
            j18 = j12;
        } else {
            j18 = j13;
        }
        if (j18 == Long.MAX_VALUE) {
            j19 = -9223372036854775807L;
        } else {
            j19 = j18;
        }
        List list = null;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (e5.a.o(xmlPullParser, "Initialization")) {
                jVar = o(xmlPullParser, "sourceURL", "range");
            } else if (e5.a.o(xmlPullParser, "SegmentTimeline")) {
                list2 = u(xmlPullParser, m10, j11);
            } else if (e5.a.o(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!e5.a.m(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.f27585a;
            }
            if (list2 == null) {
                list2 = oVar.f27573f;
            }
            if (list == null) {
                list = oVar.f27577j;
            }
        }
        return new o(jVar, m10, m11, m13, m12, list2, j19, list, x.F(j14), x.F(j10));
    }

    public static p t(XmlPullParser xmlPullParser, p pVar, List list, long j10, long j11, long j12, long j13, long j14) {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        e5.o oVar;
        e5.o oVar2;
        long j21 = 1;
        if (pVar != null) {
            j15 = pVar.f27586b;
        } else {
            j15 = 1;
        }
        long m10 = m(xmlPullParser, "timescale", j15);
        if (pVar != null) {
            j16 = pVar.f27587c;
        } else {
            j16 = 0;
        }
        long m11 = m(xmlPullParser, "presentationTimeOffset", j16);
        if (pVar != null) {
            j17 = pVar.f27572e;
        } else {
            j17 = -9223372036854775807L;
        }
        long m12 = m(xmlPullParser, "duration", j17);
        if (pVar != null) {
            j21 = pVar.f27571d;
        }
        long m13 = m(xmlPullParser, "startNumber", j21);
        int i10 = 0;
        while (true) {
            if (i10 < list.size()) {
                f fVar = (f) list.get(i10);
                if (dp.b.i1("http://dashif.org/guidelines/last-segment-number", fVar.f27540a)) {
                    j18 = Long.parseLong(fVar.f27541b);
                    break;
                }
                i10++;
            } else {
                j18 = -1;
                break;
            }
        }
        long j22 = j18;
        if (j13 == -9223372036854775807L) {
            j19 = j12;
        } else {
            j19 = j13;
        }
        if (j19 == Long.MAX_VALUE) {
            j20 = -9223372036854775807L;
        } else {
            j20 = j19;
        }
        j jVar = null;
        if (pVar != null) {
            oVar = pVar.f27579k;
        } else {
            oVar = null;
        }
        e5.o v10 = v(xmlPullParser, "media", oVar);
        if (pVar != null) {
            oVar2 = pVar.f27578j;
        } else {
            oVar2 = null;
        }
        e5.o v11 = v(xmlPullParser, "initialization", oVar2);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (e5.a.o(xmlPullParser, "Initialization")) {
                jVar = o(xmlPullParser, "sourceURL", "range");
            } else if (e5.a.o(xmlPullParser, "SegmentTimeline")) {
                list2 = u(xmlPullParser, m10, j11);
            } else {
                b(xmlPullParser);
            }
        } while (!e5.a.m(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.f27585a;
            }
            if (list2 == null) {
                list2 = pVar.f27573f;
            }
        }
        return new p(jVar, m10, m11, m13, j22, m12, list2, j20, v11, v10, x.F(j14), x.F(j10));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j10, long j11) {
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (e5.a.o(xmlPullParser, "S")) {
                long m10 = m(xmlPullParser, "t", -9223372036854775807L);
                if (z10) {
                    j12 = a(arrayList, j12, j13, i10, m10);
                }
                if (m10 == -9223372036854775807L) {
                    m10 = j12;
                }
                long m11 = m(xmlPullParser, "d", -9223372036854775807L);
                i10 = l(xmlPullParser, MatchIndex.ROOT_VALUE, 0);
                z10 = true;
                j13 = m11;
                j12 = m10;
            } else {
                b(xmlPullParser);
            }
        } while (!e5.a.m(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            a(arrayList, j12, j13, i10, x.L(j11, j10, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00c6. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String[], java.io.Serializable] */
    public static e5.o v(XmlPullParser xmlPullParser, String str, e5.o oVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            String[] strArr = new String[5];
            int[] iArr = new int[4];
            ?? r12 = new String[4];
            strArr[0] = HttpUrl.FRAGMENT_ENCODE_SET;
            int i10 = 0;
            int i11 = 0;
            while (i10 < attributeValue.length()) {
                int indexOf = attributeValue.indexOf("$", i10);
                if (indexOf == -1) {
                    strArr[i11] = strArr[i11] + attributeValue.substring(i10);
                    i10 = attributeValue.length();
                } else if (indexOf != i10) {
                    strArr[i11] = strArr[i11] + attributeValue.substring(i10, indexOf);
                    i10 = indexOf;
                } else if (attributeValue.startsWith("$$", i10)) {
                    strArr[i11] = nn.d.o(new StringBuilder(), strArr[i11], "$");
                    i10 += 2;
                } else {
                    int i12 = i10 + 1;
                    int indexOf2 = attributeValue.indexOf("$", i12);
                    String substring = attributeValue.substring(i12, indexOf2);
                    if (substring.equals("RepresentationID")) {
                        iArr[i11] = 1;
                    } else {
                        int indexOf3 = substring.indexOf("%0");
                        if (indexOf3 != -1) {
                            str2 = substring.substring(indexOf3);
                            if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                                str2 = str2.concat("d");
                            }
                            substring = substring.substring(0, indexOf3);
                        } else {
                            str2 = "%01d";
                        }
                        substring.getClass();
                        substring.hashCode();
                        char c10 = 65535;
                        switch (substring.hashCode()) {
                            case -1950496919:
                                if (substring.equals("Number")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case 2606829:
                                if (substring.equals("Time")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 38199441:
                                if (substring.equals("Bandwidth")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c10) {
                            case 0:
                                iArr[i11] = 2;
                                break;
                            case 1:
                                iArr[i11] = 4;
                                break;
                            case 2:
                                iArr[i11] = 3;
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                        }
                        r12[i11] = str2;
                    }
                    i11++;
                    strArr[i11] = HttpUrl.FRAGMENT_ENCODE_SET;
                    i10 = indexOf2 + 1;
                }
            }
            return new e5.o(strArr, iArr, (Serializable) r12, i11);
        }
        return oVar;
    }

    @Override // v5.q
    public final Object i(Uri uri, g5.g gVar) {
        try {
            XmlPullParser newPullParser = this.f27539a.newPullParser();
            newPullParser.setInput(gVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return n(newPullParser, uri);
            }
            throw ParserException.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw ParserException.b(null, e10);
        }
    }
}
