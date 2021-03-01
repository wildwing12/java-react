const Util = {
    isEmpty: val => {
        return val === '' || val === null || val === undefined;
    },
    isNotEmpty: val => {
        return !Util.isEmpty(val);
    },
    ignoreEmptyValue: val => {
        return Util.isEmpty(val) ? '' : val;
    }
}

export default Util;