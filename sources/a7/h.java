package a7;

import android.graphics.Color;
import android.text.TextUtils;
import e5.m;
import e5.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f244a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f245b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f246c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f247d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f246c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f247d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.text.SpannableStringBuilder r19, a7.e r20, java.lang.String r21, java.util.List r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.h.a(android.text.SpannableStringBuilder, a7.e, java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, e eVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVar = (b) list.get(i11);
            String str2 = eVar.f227a;
            if (bVar.f204a.isEmpty() && bVar.f205b.isEmpty() && bVar.f206c.isEmpty() && bVar.f207d.isEmpty()) {
                i10 = TextUtils.isEmpty(str2);
            } else {
                int a10 = b.a(bVar.f207d, b.a(bVar.f205b, b.a(bVar.f204a, 0, 1073741824, str), 2, str2), 4, eVar.f229c);
                if (a10 != -1) {
                    if (eVar.f230d.containsAll(bVar.f206c)) {
                        i10 = a10 + (bVar.f206c.size() * 4);
                    }
                }
                i10 = 0;
            }
            if (i10 > 0) {
                arrayList.add(new f(i10, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList b10 = b(list, str, eVar);
        for (int i10 = 0; i10 < b10.size(); i10++) {
            int i11 = ((f) b10.get(i10)).f232b.f219p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, p pVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String group = matcher.group(1);
            group.getClass();
            gVar.f233a = j.b(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gVar.f234b = j.b(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, gVar);
            StringBuilder sb2 = new StringBuilder();
            String h10 = pVar.h(kp.e.f23433c);
            while (!TextUtils.isEmpty(h10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(h10.trim());
                h10 = pVar.h(kp.e.f23433c);
            }
            gVar.f235c = f(str, sb2.toString(), arrayList);
            return new c(gVar.a().a(), gVar.f233a, gVar.f234b);
        } catch (NumberFormatException unused) {
            m.f("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0098, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c5, code lost:
    
        if (r7.equals("start") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0084, code lost:
    
        switch(r15) {
            case 0: goto L41;
            case 1: goto L41;
            case 2: goto L45;
            case 3: goto L44;
            case 4: goto L43;
            case 5: goto L42;
            default: goto L40;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0087, code lost:
    
        e5.m.f("WebvttCueParser", "Invalid alignment value: ".concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0090, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0099, code lost:
    
        r19.f236d = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0092, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0094, code lost:
    
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0096, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00f8. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r18, a7.g r19) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.h.e(java.lang.String, a7.g):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00df, code lost:
    
        if (r11.equals("i") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01cd, code lost:
    
        switch(r13) {
            case 0: goto L122;
            case 1: goto L121;
            case 2: goto L120;
            case 3: goto L119;
            default: goto L118;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01d0, code lost:
    
        e5.m.f("WebvttCueParser", "ignoring unsupported entity: '&" + r7 + ";'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01f8, code lost:
    
        if (r9 != r12) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01fa, code lost:
    
        r3.append((java.lang.CharSequence) " ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01fd, code lost:
    
        r7 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01e9, code lost:
    
        r3.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ed, code lost:
    
        r3.append('&');
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f1, code lost:
    
        r3.append(com.airbnb.deeplinkdispatch.UrlTreeKt.configurablePathSegmentPrefixChar);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f5, code lost:
    
        r3.append(com.airbnb.deeplinkdispatch.UrlTreeKt.configurablePathSegmentSuffixChar);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x009d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString f(java.lang.String r16, java.lang.String r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.h.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, g gVar) {
        int indexOf = str.indexOf(44);
        char c10 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i10 = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    i10 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i10 = 0;
                    break;
                default:
                    m.f("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f239g = i10;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            gVar.f237e = j.a(str);
            gVar.f238f = 0;
        } else {
            gVar.f237e = Integer.parseInt(str);
            gVar.f238f = 1;
        }
    }
}
