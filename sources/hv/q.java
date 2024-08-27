package hv;

import java.io.DataOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.threeten.bp.zone.ZoneRulesException;

/* loaded from: classes2.dex */
public abstract class q implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f18758a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        f18758a = Collections.unmodifiableMap(hashMap);
    }

    public q() {
        if (getClass() != r.class && getClass() != s.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static q l(lv.k kVar) {
        q qVar = (q) kVar.b(lv.n.f25449d);
        if (qVar != null) {
            return qVar;
        }
        throw new RuntimeException("Unable to obtain ZoneId from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName());
    }

    public static q p() {
        s sVar;
        s sVar2;
        String id2 = TimeZone.getDefault().getID();
        el.l.D0(id2, "zoneId");
        Map map = f18758a;
        el.l.D0(map, "aliasMap");
        String str = (String) map.get(id2);
        if (str != null) {
            id2 = str;
        }
        if (id2.equals("Z")) {
            return r.f18761f;
        }
        if (id2.length() != 1) {
            if (!id2.startsWith("+") && !id2.startsWith("-")) {
                if (!id2.equals("UTC") && !id2.equals("GMT") && !id2.equals("UT")) {
                    if (!id2.startsWith("UTC+") && !id2.startsWith("GMT+") && !id2.startsWith("UTC-") && !id2.startsWith("GMT-")) {
                        if (!id2.startsWith("UT+") && !id2.startsWith("UT-")) {
                            return s.r(id2, true);
                        }
                        r s7 = r.s(id2.substring(2));
                        if (s7.f18764b == 0) {
                            sVar2 = new s("UT", new mv.g(s7));
                        } else {
                            sVar2 = new s("UT" + s7.f18765c, new mv.g(s7));
                        }
                        return sVar2;
                    }
                    r s10 = r.s(id2.substring(3));
                    if (s10.f18764b == 0) {
                        sVar = new s(id2.substring(0, 3), new mv.g(s10));
                    } else {
                        sVar = new s(id2.substring(0, 3) + s10.f18765c, new mv.g(s10));
                    }
                    return sVar;
                }
                r rVar = r.f18761f;
                rVar.getClass();
                return new s(id2, new mv.g(rVar));
            }
            return r.s(id2);
        }
        throw new RuntimeException("Invalid zone: ".concat(id2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return m().equals(((q) obj).m());
        }
        return false;
    }

    public int hashCode() {
        return m().hashCode();
    }

    public abstract String m();

    public abstract mv.h n();

    public final q o() {
        try {
            mv.h n10 = n();
            if (n10.e()) {
                return n10.a(e.f18716c);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    public abstract void q(DataOutput dataOutput);

    public String toString() {
        return m();
    }
}
