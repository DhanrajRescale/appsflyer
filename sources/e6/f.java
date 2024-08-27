package e6;

import java.util.Arrays;
import kp.j;
import lp.j1;
import lp.l0;
import lp.o0;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f15083a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f15084b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f15085c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r7 == (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static l5.j a(java.lang.String r21) {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r21
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = e5.a.o(r0, r1)
            r3 = 0
            if (r2 == 0) goto Ld9
            lp.l0 r2 = lp.o0.f25025b
            lp.j1 r2 = lp.j1.f24998e
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = e5.a.o(r0, r8)
            if (r8 == 0) goto La5
            java.lang.String[] r2 = e6.f.f15083a
            r6 = 0
            r7 = r6
        L37:
            r8 = 4
            if (r7 >= r8) goto La4
            r9 = r2[r7]
            java.lang.String r9 = e5.a.k(r0, r9)
            if (r9 == 0) goto La1
            int r2 = java.lang.Integer.parseInt(r9)
            r7 = 1
            if (r2 != r7) goto La4
            java.lang.String[] r2 = e6.f.f15084b
            r7 = r6
        L4c:
            if (r7 >= r8) goto L64
            r9 = r2[r7]
            java.lang.String r9 = e5.a.k(r0, r9)
            if (r9 == 0) goto L61
            long r7 = java.lang.Long.parseLong(r9)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L65
            goto L64
        L61:
            int r7 = r7 + 1
            goto L4c
        L64:
            r7 = r4
        L65:
            java.lang.String[] r2 = e6.f.f15085c
        L67:
            r9 = 2
            if (r6 >= r9) goto L9b
            r10 = r2[r6]
            java.lang.String r10 = e5.a.k(r0, r10)
            if (r10 == 0) goto L98
            long r13 = java.lang.Long.parseLong(r10)
            e6.b r2 = new e6.b
            java.lang.String r16 = "image/jpeg"
            r17 = 0
            r19 = 0
            r15 = r2
            r15.<init>(r16, r17, r19)
            e6.b r6 = new e6.b
            java.lang.String r12 = "video/mp4"
            r15 = 0
            r11 = r6
            r11.<init>(r12, r13, r15)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r6}
            lp.g0.a(r9, r2)
            lp.j1 r2 = lp.o0.o(r9, r2)
            goto L9f
        L98:
            int r6 = r6 + 1
            goto L67
        L9b:
            lp.l0 r2 = lp.o0.f25025b
            lp.j1 r2 = lp.j1.f24998e
        L9f:
            r6 = r7
            goto Lc6
        La1:
            int r7 = r7 + 1
            goto L37
        La4:
            return r3
        La5:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = e5.a.o(r0, r8)
            if (r8 == 0) goto Lb6
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            lp.j1 r2 = b(r0, r2, r8)
            goto Lc6
        Lb6:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = e5.a.o(r0, r8)
            if (r8 == 0) goto Lc6
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            lp.j1 r2 = b(r0, r2, r8)
        Lc6:
            boolean r8 = e5.a.m(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld3
            return r3
        Ld3:
            l5.j r0 = new l5.j
            r0.<init>(r6, r2)
            return r0
        Ld9:
            java.lang.String r0 = "Couldn't find xmp metadata"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.f.a(java.lang.String):l5.j");
    }

    public static j1 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        l0 l0Var = o0.f25025b;
        j.A(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i10 = 0;
        boolean z10 = false;
        do {
            xmlPullParser.next();
            if (e5.a.o(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String k10 = e5.a.k(xmlPullParser, concat3);
                String k11 = e5.a.k(xmlPullParser, concat4);
                String k12 = e5.a.k(xmlPullParser, concat5);
                String k13 = e5.a.k(xmlPullParser, concat6);
                if (k10 != null && k11 != null) {
                    if (k12 != null) {
                        j10 = Long.parseLong(k12);
                    } else {
                        j10 = 0;
                    }
                    if (k13 != null) {
                        j11 = Long.parseLong(k13);
                    } else {
                        j11 = 0;
                    }
                    b bVar = new b(k10, j10, j11);
                    int i11 = i10 + 1;
                    if (objArr.length < i11) {
                        objArr = Arrays.copyOf(objArr, bl.j.z(objArr.length, i11));
                    } else {
                        if (z10) {
                            objArr = (Object[]) objArr.clone();
                        }
                        objArr[i10] = bVar;
                        i10++;
                    }
                    z10 = false;
                    objArr[i10] = bVar;
                    i10++;
                } else {
                    return j1.f24998e;
                }
            }
        } while (!e5.a.m(xmlPullParser, concat2));
        return o0.o(i10, objArr);
    }
}
