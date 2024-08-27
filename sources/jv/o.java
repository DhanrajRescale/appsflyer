package jv;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class o implements e {

    /* renamed from: a, reason: collision with root package name */
    public final char f21712a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21713b;

    public o(char c10, int i10) {
        this.f21712a = c10;
        this.f21713b = i10;
    }

    @Override // jv.e
    public final boolean a(e5.o oVar, StringBuilder sb2) {
        i iVar;
        i iVar2;
        i iVar3;
        Locale locale = (Locale) oVar.f15031d;
        ConcurrentHashMap concurrentHashMap = lv.s.f25466g;
        el.l.D0(locale, "locale");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry()));
        int firstDayOfWeek = gregorianCalendar.getFirstDayOfWeek();
        hv.c cVar = hv.c.f18707a;
        int i10 = 1;
        lv.s a10 = lv.s.a(gregorianCalendar.getMinimalDaysInFirstWeek(), hv.c.f18711e[(((int) ((firstDayOfWeek - 1) % 7)) + 13) % 7]);
        char c10 = this.f21712a;
        if (c10 != 'W') {
            if (c10 != 'Y') {
                int i11 = this.f21713b;
                if (c10 != 'c') {
                    if (c10 != 'e') {
                        if (c10 != 'w') {
                            iVar2 = null;
                        } else {
                            iVar3 = new i(a10.f25471e, i11, 2, 4);
                        }
                    } else {
                        iVar3 = new i(a10.f25469c, i11, 2, 4);
                    }
                } else {
                    iVar3 = new i(a10.f25469c, i11, 2, 4);
                }
                iVar2 = iVar3;
            } else {
                int i12 = this.f21713b;
                if (i12 == 2) {
                    iVar2 = new l(a10.f25472f, l.f21701i);
                } else {
                    lv.r rVar = a10.f25472f;
                    if (i12 >= 4) {
                        i10 = 5;
                    }
                    iVar = new i(rVar, i12, 19, i10, -1);
                }
            }
            return iVar2.a(oVar, sb2);
        }
        iVar = new i(a10.f25470d, 1, 2, 4);
        iVar2 = iVar;
        return iVar2.a(oVar, sb2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Localized(");
        int i10 = this.f21713b;
        char c10 = this.f21712a;
        if (c10 == 'Y') {
            int i11 = 1;
            if (i10 == 1) {
                sb2.append("WeekBasedYear");
            } else if (i10 == 2) {
                sb2.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
            } else {
                sb2.append("WeekBasedYear,");
                sb2.append(i10);
                sb2.append(",19,");
                if (i10 >= 4) {
                    i11 = 5;
                }
                sb2.append(jr.h.x(i11));
            }
        } else {
            if (c10 != 'c' && c10 != 'e') {
                if (c10 == 'w') {
                    sb2.append("WeekOfWeekBasedYear");
                } else if (c10 == 'W') {
                    sb2.append("WeekOfMonth");
                }
            } else {
                sb2.append("DayOfWeek");
            }
            sb2.append(",");
            sb2.append(i10);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
