
/*
 * InputStepImpllinks.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_InputStepImpllinks_H_
#define TINY_CPP_CLIENT_InputStepImpllinks_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Link.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InputStepImpllinks{
public:

    /*! \brief Constructor.
	 */
    InputStepImpllinks();
    InputStepImpllinks(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InputStepImpllinks();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Link getSelf();

	/*! \brief Set 
	 */
	void setSelf(Link  self);
	/*! \brief Get 
	 */
	std::string getClass();

	/*! \brief Set 
	 */
	void setClass(std::string  _class);


    private:
    Link self;
    std::string _class{};
};
}

#endif /* TINY_CPP_CLIENT_InputStepImpllinks_H_ */
