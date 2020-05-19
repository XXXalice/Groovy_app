@Grab("thymeleaf-spring5")

@Controller
class App {
    @RequestMapping("/")
    @ResponseBody
    def home(ModelAndView mav) {
        mav.setViewName("input")
        mav.addObject("msg", "please write your name!!")
        mav
    }

    @RequestMapping(value="/send", method=RequestMethod.POST)
    @ResponseBody
    def send(@RequestParam("text1")String str, ModelAndView mav) {
        mav.setViewName("input")
        mav.addObject("msg", "hello, " + str)
        mav.addObject("value", str)
        mav
    }
}